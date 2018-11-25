
$(document).ready(function() {
    // 사이드바 Dropdown 이벤트
    $('.dropdown-btn').each(function() {
        $(this).click(function() {
            $(this).toggleClass("active");
            $(this).next().toggle();
        });
    });

    viewSideMenu();
});

function viewSideMenu() {
    var pathname = window.location.pathname;

    $('.sidenav a').each(function () {
        if($(this).attr('href') == pathname) {
            $(this).css('color', '#f1f1f1');
            $(this).parent().show();
            $(this).parent().prev().addClass('active');
        }
    });
}