<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/1/2020
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
    <style>
        .calculator {
            width: 400px;
        }
      input[type=submit]{
        margin: 3px;
      }
    </style>
</head>
<body>
<h1>Simple Calculator</h1>
<div class="calculator">
    <form action="/calculate" method="post">
        <fieldset>
            <legend>Calculator</legend>
            <table>
                <tr>
                    <td>First operand</td>
                    <td><input type="number" name="firstNumber"></td>
                </tr>
                <tr>
                    <td>Operator</td>
                    <td>
                        <select name="operator">
                          <option value="+">+</option>
                          <option value="-">-</option>
                          <option value="*">*</option>
                          <option value="/">/</option>

                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Second operand</td>
                    <td><input type="number" name="secondNumber"></td>
                </tr>
              <tr>
                <td></td>
                <td><input type="submit" value="Calculate"><input type="reset" value="Cancel"></td>
              </tr>
            </table>
        </fieldset>
    </form>
</div>

</body>
</html>
