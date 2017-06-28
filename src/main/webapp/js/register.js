/**
 * Created by Vodka on 2017/5/29.
 */
$(document).ready(function() {

    $('#register_btn').click(function() {
        $.ajax({
                url: '/users/register',
                data: $('#register-form').serialize(),
                type: 'post',
                dataType: 'json'
            }
        ).done(function(res) {
            if(res.user) {
                window.location = '/login'
            } else {
                alert("注册失败！");
            }
        }).fail(function(err) {
            alert("注册失败!" +
                "请检查手机号是否正确!");
        });
        return false;
    })

    $('#register-form').submit(function() {
       return false
    })
});


