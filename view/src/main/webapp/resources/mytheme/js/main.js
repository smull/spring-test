$( document ).ready(function() {

    $.ajax({
        dataType: 'json',
        url: '/updateinfo',
        success: function (data) {
            var tableContent;
            alert("111");
            $.each(data, function (idx, obj) {
                tableContent = obj.sellerPrice;
                $("#priceCom").html(tableContent);
            })
           /* if (choiceSellBuy == "sell") {
                $.each(data, function (idx, obj) {
                    if(obj.name == companyChoice)
                        tableContent = obj.sellerPrice;
                });
            }
            if(choiceSellBuy == "buy") {
                $.each(data, function (idx, obj) {
                    if(obj.name == companyChoice)
                        tableContent = obj.buyerPrice;
                });
            }*/

        }
    });


    $('#price').change(function(data) {
        var choiceSellBuy = $("#price :selected").val();
        var companyChoice = $("#companiesName :selected").val();
        alert("sasa");

        /*$.ajax({
            dataType: 'json',
            url: '/updateinfo',
            success: function (data) {
                var tableContent;
                    alert("111");
                tableContent = obj.sellerPrice;
                    if (choiceSellBuy == "sell") {
                        $.each(data, function (idx, obj) {
                            if(obj.name == companyChoice)
                                tableContent = obj.sellerPrice;
                        });
                    }
                    if(choiceSellBuy == "buy") {
                        $.each(data, function (idx, obj) {
                            if(obj.name == companyChoice)
                                tableContent = obj.buyerPrice;
                        });
                    }
                    $("#priceCom").html(tableContent);
                }
        });*/
    });

    /*$('#msg').html("This is updated by jQuery")
    var nIntervId;

    $('#price').change(function() {
        var choiceSellBuy = $("#price :selected").val();
        var companyChoice = $("#companiesName :selected").val();




        if(choiceSellBuy == "sell"){
            if(companyChoice == "apple") {
                $(".kit").hide();
                $('#price').show();


            }

            if(companyChoice == "cisco") {
                $(".kit").hide();
                $('#sellPriceCisco').show();

            }

            if(companyChoice == "intel"){
                $(".kit").hide();
                $('#sellPriceIntel').show();
            }

        }
        if(choiceSellBuy == "buy"){
            if(companyChoice == "apple") {
                $(".kit").hide();
                $('#buyPriceApple').show();
            }

            if(companyChoice == "cisco") {
                //$('#buyPriceApple').hide();
                $(".kit").hide();
                $('#buyPriceCisco').show();
                //$('#buyPriceIntel').hide();
            }

            if(companyChoice == "intel") {
                //$('#buyPriceApple').hide();
                //$('#buyPriceCisco').hide();
                $(".kit").hide();
                $('#buyPriceIntel').show();
            }
            //$('#buyerPrice').html(3333);
           // $('#msg').html("Buy")
        }

        //$('#div' + $(this).val()).hide('slow');
    });*/
});