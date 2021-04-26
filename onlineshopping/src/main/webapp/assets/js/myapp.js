$(document).ready(function() {
    $.ajax({
        url: "https://openexchangerates.org/api/latest.json?app_id=866e4d6909d041228172699c640933fe"     
    }).then(function(data) {
       $('.greeting-id').append(data.base);
       $('.greeting-content').append(data.rates.AFN);
    });
});