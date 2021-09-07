<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: v.konkov
  Date: 07.09.2021
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="main">
    <form>
        <div class="question">
            <div class="question-header">1 вопрос</div>
            <p class="question-description">
                Напишите ваше имя.
            </p>
            <input class="question-input" name="name">
        </div>
        <div class="question">
            <div class="question-header">2 вопрос</div>
            <p class="question-description">
                Сколько вам лет?
            </p>
            <input class="question-number" name="age" type="number" min="4" max="100">
        </div>
        <div class="question">
            <div class="question-header">3 вопрос</div>
            <p class="question-description">В каком регионе проживаете?</p>
            <select class="question-select" name="region">
                <option>Урал</option>
                <option>Сибирь</option>
                <option>Поволжье</option>
                <option>Дальний восток</option>
                <option>Москва или рядом с ней</option>
                <option>Юга</option>
            </select>
        </div>
        <div class="question">
            <div class="question-header">4 вопрос</div>
            <p class="question-description">
                Какой фреймворк для <a href="https://learn.javascript.ru/">Javascript</a> вы предпочитаете?
            </p>
            <input type="checkbox" id="answer-1" name="framework">
            <label for="answer-1">React</label>
            <img src="<c:url value="component/img/react.png"/>" alt="React" height="200" width="300"><br>
            <input type="checkbox" id="answer-2" name="framework">
            <label for="answer-2">Angular</label>
            <img src="<c:url value="component/img/angular.png"/>" alt="Angular" height="200" width="200"><br>
            <input type="checkbox" id="answer-3" name="framework">
            <label for="answer-3">Vue</label>
            <img src="<c:url value="component/img/vue.png"/>" alt="Vue" height="200" width="200">
        </div>
        <input type="submit">
    </form>
</div>
</body>
</html>
