
$(document).ready(function() {
    // 사이드바 Dropdown 이벤트
    $('.dropdown-btn').each(function() {
        $(this).click(function() {
            $(this).toggleClass("active");
            $(this).next().toggle();
        });
    });
});