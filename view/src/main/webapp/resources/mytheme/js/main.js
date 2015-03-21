$( document ).ready(function() {
    $('#price').change(function() {
        $.ajax({
            dataType: 'json',
            url: '/updateinfo',
            success: function (data) {
                var tableContent;
                console.log("111");
                $.each(data, function (idx, obj) {
                    var choiceSellBuy = $("#price :selected").val();
                    var companyChoice = $("#companiesName :selected").val();
                    var numberShare = $("#number").val();
                    if (choiceSellBuy == "sell") {
                        $.each(data, function (idx, obj) {
                            if (obj.name == companyChoice)
                                tableContent = obj.sellerPrice * numberShare;
                        });
                    }
                    if (choiceSellBuy == "buy") {
                        $.each(data, function (idx, obj) {
                            if (obj.name == companyChoice)
                                tableContent = obj.buyerPrice * numberShare;
                        });
                    }
                    $("#priceCom").html(tableContent);
                })
            }
        });
    });
});