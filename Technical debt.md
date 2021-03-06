# Технический долг

## Анализ признаков технического долга

* непонятный / нечитабельный код - отсутствует
* дублирующийся код - присутствует     
* отсутствие автоматизации (тестов, сборки, автоматизации) - тесты незначительно присутствуют
* запутанная архитектура - присутствует
* медленные средства - отсутствуют
* незакомиченный код / долгоживущие ветки - отсутствуют
* отсутствие / несоответствие технической документации - отсутствует документация
* отсутствие тестовой среды - незначительно присутствует
* длинные циклы интеграции / отсутствие непрерывной интеграции - CI отсутствует 

## Мероприятия по устранению технического долга

* рефакторинг кода -  устранение дублирующегося кода  
* исправить ошибки архитектуры: реализовать уровень сервисов для устранения перегруженности уровня контроллера и улучшения расширяемости функционала приложения
* добавление новых тестов   
* написание технической документации

## Оценка плана мероприятий

* техническая документация - 1,5 часа
* рефакторинг кода - 1 час  
* исправление архитектуры - 2 часа  
* написание тестов - 1 час

## Вывод

 Устранение технического долга на протяжении текущего спринта решит большинство проблем с кодом, а также архитектура станет более понятной и открытой для интеграции новых решений. Добавление технической документации позволит ознакомится пользователям с особенностями и функциональностью разработанного веб-приложения. 
