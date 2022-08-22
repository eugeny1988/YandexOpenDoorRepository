Тестовое задание для прохождения на День стажёра Яндекса - Мобильная разработка, 2022 год

A. Кодирование длин серий
Ограничение времени	2 секунды
Ограничение памяти	64Mb
Ввод	стандартный ввод или input.txt
Вывод	стандартный вывод или output.txt
Кодирование длин серий (RLE) — алгоритм сжатия данных, заменяющий повторяющиеся символы на один символ и число его повторов. Серией называется последовательность, состоящая из нескольких одинаковых символов (более одного). При кодировании строка одинаковых символов, составляющих серию, заменяется строкой, содержащей сам повторяющийся символ и количество его повторов.

Например, строка AAAABBB будет сжата в строку A4B3, а строка AAAAAAAAAAAAAAABAAAAA — в строку A15BA5.

Вам дана сжатая строка, найдите длину исходной строки. Длина исходной строки не превосходит 1000 символов, все символы исходной строки заглавные большие буквы латинского алфавита.

Формат ввода
В единственной строке входных данных содержится непустая строка s. Гарантируется, что s результат корректного сжатия некоторой строки.

Формат вывода
Выведите длину исходной строки.

Пример 1
Ввод	Вывод
A15BA5
21
Пример 2
Ввод	Вывод
ABCDR
5
Пример 3
Ввод	Вывод
Z123XY
125
