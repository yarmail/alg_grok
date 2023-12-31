<a href="/README.md">вернуться к оглавлению</a><br>

<h3> Глава 9. Динамическое программирование </h3>

ЗАДАЧА О РЮКЗАКЕ

Мы уже знаем несколько способов решения задачи о рюкзаке:

* Простое - Перебор всех возможных множеств предметов - O(2<sup>n</sup>).
* Приближенное - с помощью жадного алгоритма (берем самое дорогое, что влезает).

Есть еще одно, самое оптимальное - динамическое программирование.

Оно основано на рассмотрении не только конечного случая (целый рюкзак, но и подслучаев <br> 
- рюкзаки меньшего размера).


САМАЯ ДЛИННАЯ ОБЩАЯ ПОДСТРОКА 

Еще одна задача для динамического программирования - поиск наибольшей общей подстроки <br>
или подпоследовательности

РЕЗЮМЕ

* Динамическое программирование применяется для оптимизации какой-либо <br> 
характеристики при заданных ограничениях. В задаче о рюкзаке требуется максимизировать <br> 
стоимость отобранных предметов с ограничениями по емкости рюкзака.
* Динамическое программирование работает только в ситуациях, в которых задача<br> 
может быть разбита на автономные подзадачи, не зависящие друг от друга.

Несколько общих рекомендаций:

* в каждом решении из области динамического программирования строится таблица;
* значения ячеек таблицы обычно соответствуют оптимизируемой характеристике. <br> 
Для задачи о рюкзаке значения представляли общую стоимость товаров;
* каждая ячейка представляет подзадачу, поэтому вы должны подумать о том, <br> 
как разбить задачу на подзадачи. Это поможет вам определиться с осями.

Шпаргалка:

* Динамическое программирование применяется при оптимизации некоторой характеристики.
* Динамическое программирование работает только в ситуациях, в которых задача может <br> 
быть разбита на автономные подзадачи.
* В каждом решении из области динамического программирования строится таблица.
* Значения ячеек таблицы обычно соответствуют оптимизируемой характеристике.
* Каждая ячейка представляет подзадачу, поэтому вы должны подумать о том, как <br> 
разбить задачу на подзадачи.
* Не существует единой формулы для вычисления решений методом динамического 
программирования.

_Пример с подстрокой в этой папке_