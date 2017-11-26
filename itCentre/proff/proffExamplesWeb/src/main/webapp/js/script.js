$(document).ready(init);

function init() {
    $('#add').bind('click', show);
}
function show() {
    $.ajax({
        //dataType: 'json',
        //type: 'GET',
        url: '/employees',
        success: function(jsondata){
            //alert(jsondata);
            for(var i=0; i < jsondata.length; i++) {
                var user = jsondata[i];
                var tr = $('<tr></tr>');
                tr.append($('<td></td>').text(user.firstName));
                tr.append($('<td></td>').text(user.lastName));;
                $('#table').append(tr);
            }
        },
        error: function(a,b,c) {
            alert(a+b+c);
        }
    });
    //alert($('#login').val());
    var login = $('#login').val();
    var pass = $('#pass').val();
    var tr = $('<tr></tr>');
    tr.append($('<td></td>').text(login));
    tr.append($('<td></td>').text(pass));

/*    $('#table').append(tr);
    $('#one').css({background:"red", color:"white"});
    $('#two').css("border", "red");
    $('#two, #three').css("fontWeight", "bold");*/
}
