    <%--
  Created by IntelliJ IDEA.
  User: al1
  Date: 30.03.15
  Time: 10:22
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пример приложения</title>
    <link href="css/style.css" rel="stylesheet"/>
   <script src="js/jquery-1.11.2.min.js"></script>

    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/script.js"></script>

    <script>

        $(document).ready(function() {
            var num = 56;
            alert(num);
           $('h1').append($('<p>'+num+'</p>'));
            function func () {
                $.ajax({
//                    data: 'name=as',//{'login': 'al1', 'mail': 'al1'},
                    dataType: 'json',
                    url: '/employees',
                    type: 'GET',
                    success: function (data) {
                        $('h1').append($('<p>' + data[0].firstName + '</p>'));
                    },
                    error: function (a, b, c) {
                        alert('error:' + a + b + c);
                    }
                });
            }
//            $('#sim').bind('click', func);
        });

    </script>

    <style type="text/css">
        p {
            color: aquamarine;
            background-color: brown;
            font: italic large sans-serif;
        }

/*        form, p {
            border: 1px solid black;
            border-radius: 5px;
            padding: 10px;
        }*/

        #par {
            color: cornflowerblue;
        }

        a.link {
            font-size: xx-large;
        }

        form+p {
            background-color: azure;
        }

        [border] {
            border: 3px solid green ;

        }

        ul > li {
            border: 1px dashed red;
        }
    </style>
</head>
<body>
<button id="add">click</button>
<button id="sim">simple</button>
<table id="table" border="0"></table>
<h1>Hello Proff23</h1>

<a href="hello.html">Go to HelloController</a><br/>
<a href="great.html?name=Alex">Go to HelloController Alex great</a>

${name}

<form action="/form.html" method="POST">
    <fieldset style="display: inline-block">
        <legend>Авторизация</legend>
        <input type="text" name="login" value="al1"> <br/>
        <input type="password" name="pass" value="al1"> <br/>
        <input type="submit" value="send">
    </fieldset>
</form>

<p>Полный а</p>
simple text <br/>
simple text <br/>
<a href="index.jsp">Link</a>
<%--<img src="duke.running.gif"/>--%>
<q>Citata</q>
<ul>
    <li>One</li>
    <li>Two</li>
    <li>Three</li>
</ul>

<ol>
    <li>One</li>
    <li>Two</li>
    <li>Three</li>
</ol>

<table border="1">
    <thead>
    <tr>
        <th>First</th>
        <th>First</th>
        <th>First</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td rowspan="2">1</td>
        <td colspan="2">2</td>
    </tr>
    <tr>
        <td>2</td>
        <td>3</td>
    </tr>
    </tbody>
    <tfoot>

    </tfoot>
</table>
</body>
</html>
