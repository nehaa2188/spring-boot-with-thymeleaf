export default (message) => {
    var toast = $("<div/>", {
        class: 'git-toast'
    }).html(message);
    $("body").append(toast);
    setTimeout(function () {
        toast.animate({
                bottom: '-200px'
            },
            2000, function () {
                toast.remove();
            });
    }, 2000);
};
