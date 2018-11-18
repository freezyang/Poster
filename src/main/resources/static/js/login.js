
function checkLoginInfo() {
    var id = $('#id').val();
    var password = $('#password').val();

    if (!validate(id, password)) {
        return;
    }

    var params = {
        id : id,
        password : password
    };

    $.post("/member/login/check", params, function (data) {
        if (data['code'] == 'OK') {
            location.href = "/home/index";
        } else {
            alert(data['msg']);
        }
    }, 'JSON');
}

function validate(id, password) {
    if ($.trim(id).length < 1) {
        alert('ID를 입력해주세요.');
        return false;
    }

    if ($.trim(password).length < 1) {
        alert('Password를 입력해주세요.');
        return false;
    }
    return true;
}