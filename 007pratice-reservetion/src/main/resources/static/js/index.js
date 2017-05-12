+function () {
    axios.defaults.headers.common['Content-Type'] = 'application/x-www-form-urlencoded'

    Date.prototype.formatDate = function (fmt) { // author: meizz
        var o = {
            "M+": this.getMonth() + 1, // 月份
            "d+": this.getDate(), // 日
            "h+": this.getHours(), // 小时
            "m+": this.getMinutes(), // 分
            "s+": this.getSeconds(), // 秒
            "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
            "S": this.getMilliseconds()
            // 毫秒
        };
        if (/(y+)/.test(fmt))
            fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4
                - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1)
                    ? (o[k])
                    : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;
    }

    function getDateStr(date) {
        if (!date) {
            return ''
        }
        if (typeof  date === 'number') {
            date = new Date(date)
        }
        return date.formatDate('yyyy-MM-dd')
    }

    function nextDayDate(date, day) {
        return new Date(date.getTime() + 1000 * 3600 * 24 * day)
    }


    function initApp(pageData) {
        var date = new Date(pageData.serverTime)
        var dateStr = getDateStr(date)

        var types = [
            /*'00:00~02:00',
             '00:00~02:00',
             '04:00~06:00',
             '06:00~08:00',*/
            '08:00~10:00',
            '10:00~12:00',
            '12:00~14:00',
            '14:00~16:00',
            '16:00~18:00',
            '18:00~20:00',
            '20:00~22:00',
            /*'22:00~24:00'*/
        ]


        var DATE_MIN = getDateStr(date.getTime())
        new Vue({
            el: '#app',
            template: '#appTmpl',
            data: {
                dateYuyue: {},
                types: types,
                DATE_MIN: DATE_MIN,
                tabs: {
                    data: ['预约', '我的预约'],
                    cur: 0,
                },
                form: {
                    username: 'admin',
                    password: 'admin',
                },
                dateTime: date.getTime(),
                date: dateStr,
                table: 1,//当前设备id
                logged: pageData.isLogged,
                jsonData: {
                    tables: [],
                }
            },
            watch: {
                date: function (date) {
                    this.dateTime = new Date(date).getTime()
                    this.initRandomYuYue()
                }
            },
            methods: {
                cancelTable: function (event) {
                    if (confirm('确认取消预约')) {
                        var $li = $(event.target).closest('li')
                        $li.slideUp(function () {
                            $(this).remove()
                        })
                    }
                },
                login: function () {
                    var vm = this
                    axios.get('/user/login', {
                            params: {
                                username: vm.form.username,
                                password: vm.form.password,
                            }
                        }
                    ).then(function (response) {
                        if (response.status == 200 && response.data.status == 0) {
                            vm.logged = true
                            $('#loginModal').modal('hide')
                        } else {
                            alert("登录失败")
                        }
                    }).catch(function (response) {
                        console.log(response);
                    });


                },
                showLogin: function () {
                    $('#loginModal').modal('show')
                },
                yuyue: function (date, index, event) {

                    if (this.logged) {
                        if (confirm('确认预约 ' + date + ' ' + this.types[index])) {
                            this.dateYuyue[date][index] = true
                            this.dateYuyue[date] = this.dateYuyue[date]
                            $(event.target).addClass('disable')
                        }
                    } else {
                        this.showLogin()
                    }
                },
                initRandomYuYue: function () {
                    var vm = this
                    var dateYuyue = {}
                    new Array(7).fill(0).forEach(function (val, index) {
                        dateYuyue[getDateStr(nextDayDate(new Date(vm.dateTime), index))] = new Array(7).fill(0).map(function (index) {
                            return Math.random() > 0.5
                        })
                    })
                    vm.dateYuyue = dateYuyue
                }
            },
            created: function () {
                var vm = this
                this.initRandomYuYue()

                axios.get('/table/list')
                    .then(function (response) {
                        // console.log(response.data)
                        vm.jsonData.tables = response.data
                    })
                    .catch(function (response) {
                        console.log(response);
                    });
            }

        })
    }

    axios.get('/common/info')
        .then(function (response) {
            console.log(response.data)
            initApp(response.data)
        })
        .catch(function (response) {
            console.log(response);
        });

}()