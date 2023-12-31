<a href="/README.md">вернуться к оглавлению</a><br>

<h3> Глава 10. Алгоритм k ближайших соседей </h3>

Используется для работы с большими наборами данных.

1. Извлечение признаков - каждый элемент набора данных приводится к некоторому <br> 
набору признаков, каждый признак оценивается. Например, у фруктов можно извлекать <br> 
признаки Размера и Цвета.
2. Расположение элементов на графике (мерность по количеству признаков) в соответствии <br> 
со значением признаков. Например, грейпфруты - большие и красные, а апельсины - маленькие <br> 
и желтые, они будут собираться в разных частях графика.
3. Решение **задачи классификации** - есть некоторая точка с определенными признаками. <br> 
Нужно определить, чем она является (Апельсин или Грейпфрут?). Точка размещается на графике, <br> 
для нее находятся k ближайших точек (определение ближайших точек может проводиться <br>
по разным алгоритмам). Если среди них больше апельсинов, то вероятно целевая точка - апельсин. <br>

ПОСТРОЕНИЕ РЕКОМЕНДАТЕЛЬНОЙ СИСТЕМЫ

1. При регистрации пользователи оценивают фильмы разных жанров. <br> 
Таким образом, они преобразуются к набору признаков (Комедия - 5, Ужасы - 1), <br> 
и теперь их можно разместить на графике.<br>
2. Чтобы порекомендовать какой-нибудь фильм одному пользователю, мы берем <br> 
k ближайших к нему людей на графике и смотрим, что понравилось им.

РАССЧЕТ РАССТОЯНИЯ МЕЖДУ ТОЧКАМИ

**Формула Пифагора**

Точка А(a1, b1, c1) и Точка B(a2, b2, c2):

√ <sub>((a1 - a2)<sup>2</sup> + (b1 - b2)<sup>2</sup> + (c1 - c2)<sup>2</sup>)</sub>

Сумма векторов.

**Близость косинусов**

Метрика близости косинусов не измеряет расстояние между двумя векторами.<br> 
Вместо этого она сравнивает углы двух векторов.

ИЗВЛЕЧЕНИЕ ПРИЗНАКОВ

Преобразование элемента в список чисел, которые могут использоваться для сравнения.

Признаки должны иметь значение для той задачи, которую мы решаем. Также они не <br> 
должны содержать смещения (то есть быть равномерно распределены - <br>
не оценивать пользователей только по комедиям).


КЛАССИФИКАЦИЯ

Распределение по категориям.

РЕГРЕССИЯ

Прогнозирование чего-либо в числовом выражении.

Алгоритм ближайших k соседей может также применяться для решения задачи регрессии <br> 
- например, прогнозирование оценки пользователя конкретному фильму.

ЗНАКОМСТВО С МАШИННЫМ ОБУЧЕНИЕМ

РАСПОЗНАВАНИЕ ТЕКСТА

**OCR (Optical Character Recogition)** - оптическое распознавание текста. <br> 
Алгоритм также основывается на алгоритме ближайших соседей.

* Перебираются различные изображения символов.
* У них извлекаются определенные признаки (кривые, линии, точки, <br> 
кружочки в определенных позициях).
* Для нового изображения также извлекаются признаки и по алгоритму <br> 
ближайших соседей делается вывод, какой символ оно представляет.

ПОСТРОЕНИЕ СПАМ-ФИЛЬТРА

**Наивный классификатор Байеса**

В тренировочном наборе данных - сообщения, отмеченные как спам и как не-спам.<br> 
Алгоритм вычисляет характерные для спама слова.