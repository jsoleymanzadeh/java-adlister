<%--
  Created by IntelliJ IDEA.
  User: jaspersoleymanzadeh
  Date: 01/04/22
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/pizza-order" method="POST">
        <div>
            <label>Crust
                <select name="crust" id="crust">
                    <option value="handTossed">Hand Tossed</option>
                    <option value="crispyThin">Crispy Thin</option>
                </select>
            </label>
        </div>
        <div>
            <label>Sauce
                <select name="sauce" id="sauce">
                    <option value="tomato">Robust Inspired Tomato Sauce</option>
                    <option value="marinara">Hearty Marinara Sauce</option>
                    <option value="bbq">Honey BBQ Sauce</option>
                    <option value="garlic">Garlic Parmesan Sauce</option>
                    <option value="alfredo">Alfredo Sauce</option>
                    <option value="ranch">Ranch</option>
                </select>
            </label>
        </div>
        <div>
            <label>Size
                <select name="size" id="size">
                    <option value="small">Small (10")</option>
                    <option value="medium">Medium (12")</option>
                    <option value="large">Large (14")</option>
                </select>
            </label>
        </div>
        <div>
            <label><input type="checkbox" name="toppings" value="beef">Beef</label>
            <label><input type="checkbox" name="toppings" value="ham">Ham</label>
            <label><input type="checkbox" name="toppings" value="steak">Philly Steak</label>
            <label><input type="checkbox" name="toppings" value="bacon">Bacon</label>
            <label><input type="checkbox" name="toppings" value="peppers">Green Peppers</label>
            <label><input type="checkbox" name="toppings" value="mushrooms">Mushrooms</label>
            <label><input type="checkbox" name="toppings" value="onions">Onions</label>
            <label><input type="checkbox" name="toppings" value="jalapenos">Jalapeño Peppers</label>
        </div>
        <div>
            <label>Address <textarea name="address" id="address" cols="30" rows="10"></textarea></label>
        </div>
        <div>
            <button type="submit">Submit Order</button>
        </div>
    </form>
</body>
</html>