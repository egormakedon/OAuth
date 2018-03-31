package com.epam.makedon.generator;

enum Body {
    BODY_1("История и особенности языка программирования Паскаль (Pascal)\n" +
            "\n" +
            "Среди множества языком программирования выделяются десятки языков, нашедших широкое применение и распространение в те или иные отрезки компьютерной истории. В эту группу широко распространенных языков входит язык программирования Pascal.\n" +
            "\n" +
            "Издавна принято считать, что он хорош для обучения программированию. И действительно. Язык Паскаль был создан в конце 60-х годов Н. Виртом как специальный язык для обучения студентов. Однако вскоре из-за реализации в нем прогрессивных идей того времени получил распространение среди программистов. Было время, когда Паскаль широко использовался для написания прикладных программ и даже как язык системного программирования. Программное обеспечение многих мини- и микрокомпьютеров было написано на Pascal.\n" +
            "\n" +
            "При рождении языка программирования на свет должны появиться как его описание, так и транслятор с него в машинный код. После 70-го года язык Pascal развивался и совершенствовался, включал в себя новые возможности. Производились новые трансляторы и среды разработки для Pascal.\n" +
            "\n" +
            "Трансляторы с этого языка имелись на наиболее распространенных типах ЭВМ во всем мире. Наличие специальных методик создания трансляторов с Паскаля упростило их разработку и способствовало широкому распространению языка. Трансляторы могли оптимизировать код, и это позволяло создавать эффективные программы. Это как раз и послужило одной из причин использования Паскаля в качестве языка системного программирования.\n" +
            "\n" +
            "В 80-х годах компьютерная наука начала входить в массы, появился предмет «Информатика». Поскольку в это время Pascal был особо модным и зарекомендовал себя как учебный языка, то он нашел широкое распространение в школах и вузах. В итоге было написано огромное количество учебных пособий по этому языку.\n" +
            "\n" +
            "Среди других достоинств языка программирование Pascal можно отметить следующее:\n" +
            "\n" +
            "Простота языка позволяет быстро его освоить и создавать алгоритмически сложные программы.\n" +
            "\n" +
            "Развитые средства представления структур данных обеспечивают удобство работы как с числовой, так с символьной и битовой информацией.\n" +
            "\n" +
            "В языке Паскаль реализованы идеи структурного программирования, что делает программу наглядной и дает хорошие возможности для разработки и отладки.\n" +
            "\n" +
            "Чтобы быть более простым, Pascal имеет некоторые ограничения. Так, Паскаль хорошо «учит» понимать, как хранятся данные в памяти компьютера, но имеет ряд ограничений при работе с ними (чего лишены большинство «настоящих» языков).\n" +
            "\n" +
            "Т.к. в свое время Паскаль достаточно активно использовался для решения практических задач, на его основе сформировался язык Object Pascal (который сейчас используется в Delphi).\n" +
            "\n"),
    BODY_2("Словарь языка Pascal\n" +
            "\n" +
            "Язык программирования Pascal использует следующий набор символов.\n" +
            "\n" +
            "Английские и русские буквы, которые могут быть как строчными, так и прописными.\n" +
            "\n" +
            "Арабские цифры.\n" +
            "\n" +
            "Знаки операций и знаки, входящие в составное обозначение операций:\n" +
            "\n" +
            "+ - * / : = < >\n" +
            "\n" +
            "Ограничители:\n" +
            "\n" +
            ". , ( ) [ ] { } : ; ‘ “\n" +
            "\n" +
            "Специальные символы:\n" +
            "\n" +
            "$ @ # & ^ _ ~ %\n" +
            "\n" +
            "Для обеспечения использования ячеек памяти служат переменные.\n" +
            "\n" +
            "Переменная – это имя физического участка памяти, в котором в любой момент времени может храниться только одно значение. Для обозначения участков памяти используют идентификаторы (имена).\n" +
            "\n" +
            "Идентификаторы (имена переменных, констант программ, модулей, функций, процедур) записываются с помощью допустимых в Pascal символов и должны удовлетворять следующим правилам:\n" +
            "\n" +
            "имя должно состоять только из английских букв, цифр и символов подчеркивания (в идентификаторах в Паскале прописные и строчные буквы не различаются);\n" +
            "\n" +
            "имя может начинаться только с английской буквы или символа подчеркивания.\n" +
            "\n" +
            "Слова, употребляемые в большинстве языков программирования, в том числе и Pascal, делятся на три группы: зарезервированные (ключевые) слова; предопределенные имена и идентификаторы, определяемые программистом.\n" +
            "\n" +
            "Служебные (зарезервированные, ключевые) слова – это слова языка программирования, которые имеют специальное, раз и навсегда закрепленное за ними значение. В программе нельзя использовать идентификаторы, совпадающие по написанию ключевыми словами (например, нельзя обозначить переменную именем begin).\n" +
            "\n" +
            "Ключевые слова языка программирования Паскаль:\n" +
            "\n" +
            "and\n" +
            "\n" +
            "end\n" +
            "\n" +
            "nil\n" +
            "\n" +
            "set\n" +
            "\n" +
            "array\n" +
            "\n" +
            "file\n" +
            "\n" +
            "not\n" +
            "\n" +
            "then\n" +
            "\n" +
            "begin\n" +
            "\n" +
            "for\n" +
            "\n" +
            "of\n" +
            "\n" +
            "to\n" +
            "\n" +
            "case\n" +
            "\n" +
            "function\n" +
            "\n" +
            "or\n" +
            "\n" +
            "type\n" +
            "\n" +
            "const\n" +
            "\n" +
            "goto\n" +
            "\n" +
            "packed\n" +
            "\n" +
            "until\n" +
            "\n" +
            "div\n" +
            "\n" +
            "if\n" +
            "\n" +
            "procedure\n" +
            "\n" +
            "var\n" +
            "\n" +
            "do\n" +
            "\n" +
            "in\n" +
            "\n" +
            "program\n" +
            "\n" +
            "while\n" +
            "\n" +
            "downto\n" +
            "\n" +
            "label\n" +
            "\n" +
            "record\n" +
            "\n" +
            "with\n" +
            "\n" +
            "else\n" +
            "\n" +
            "mod\n" +
            "\n" +
            "repeat\n" +
            "\n" +
            " \n" +
            "\n" +
            " \n" +
            "\n" +
            "Предопределенные (стандартные) имена также имеют специальный (заранее заданный) смысл. Однако программист может обходить закрепленные за ними значения и использовать их в качестве имен, определяемых программистом. Если программист не определит явно, для каких целей применяется то или иное стандартное имя в программе, оно будет восприниматься в присущем данному имени предопределенном смысле (например, предопределенными являются имена Integer, Writeln и др.).\n" +
            "\n" +
            "Пользовательские имена определяются программистом и должны быть явно объявлены в программе.\n" +
            "\n" +
            "Десятичные числа всегда начинаются с цифры, перед которой может стоять знак числа, + или -.\n" +
            "\n" +
            "Действительные числа изображаются в двух форматах. В формате с фиксированной точкой явно указывают положение десятичной точки (например, 4.505, -16.25, +1.0). В формате с плавающей точкой используется десятичный порядок, обозначаемый прописной или строчной буквой E, после которой идет целое число, указывающее значение порядка, например, 8e10, 1.62e-3, 0.8E+3.\n" +
            "\n" +
            "В языке Pascal максимально допустимое целое число равняется 2147483647 (оно содержится в предопределенной целой константе MaxLongInt). Чтобы получить это число достаточно выполнить выражение\n" +
            "\n" +
            "writeln(maxlongint);\n" +
            "\n" +
            "Диапазон целых чисел от -2147483647 до 2147483647. Предопределенная в Паскале целая константа MaxInt содержит в себе значение 32767\n" +
            "\n" +
            "writeln(maxint);\n" +
            "\n" +
            "Распространенные компиляторы с Pascal позволяют оперировать действительными числами до 38 порядка, а некоторые – до 67 порядка.\n" +
            "\n" +
            "Целое число может задаваться не только в десятичной, но и в шестнадцатеричной системе счисления. Шестнадцатеричному числу предшествует знак $.\n" +
            "\n" +
            "Текстовым литералом (строкой) в языке Pascal называют последовательность любых допустимых символов, стоящих между апострофами (например, ‘Hello World!’). Если в качестве символа строки необходимо использовать апостроф, то записывают подряд два апострофа\n" +
            "\n" +
            "writeln('Don''t do it')\n" +
            "\n" +
            "Строку можно задавать также в виде последовательности, образованной из символов # с последующим цифровым кодом требуемого символа (например, запись #72#73#33 эквивалентна строке 'HI!'). В строковых данных прописные и строчные буквы различаются.\n" +
            "\n" +
            "Пробелы являются разделителями. Между любыми именами, числами, ключевыми словами должен стоять, по крайней мере, один разделитель, а может их быть и сколько угодно. Но нельзя отделять один символ от другого внутри имени, числа, либо ключевого слова.\n" +
            "\n"),
    BODY_3("Пунктуация в программах на Паскале\n" +
            "\n" +
            "Заголовок завершается точкой с запятой.\n" +
            "\n" +
            "В любом объявлении каждый список завершается точкой с запятой.\n" +
            "\n" +
            "Операторы отделены один от другого точкой с запятой.\n" +
            "\n" +
            "Слова begin и end не являются операторами – они служат знаками пунктуации. Слово begin выступает в качестве левой, а end – правой скобки. Так как они сами знаки пунктуации, то точка запятой после begin и перед end не обязательна. В программах на Паскаль слова begin и end используются преимущественно для образования составных операторов. Составной оператор может быть использован в любом месте, где мог бы быть использован простой оператор. Пример составного оператора:\n" +
            "\n" +
            "begin\n" +
            "\n" +
            "    t := a;\n" +
            "\n" +
            "    a := b;\n" +
            "\n" +
            "    b := t\n" +
            "\n" +
            "end;\n" +
            "\n" +
            "Слова в других операторах также действуют как знаки пунктуации.\n" +
            "\n" +
            "if ab > bd then\n" +
            "\n" +
            "    write(‘yes’)\n" +
            "\n" +
            "else\n" +
            "\n" +
            "    write(‘no’);\n" +
            "\n" +
            "Слова if, then, else выступают внутри оператора в качестве знаков пунктуации.\n" +
            "\n" +
            "Операторы разделены знаками пунктуации, поэтому расположение программы на странице с точки зрения компилятора значения не имеет. Вполне достаточно придерживаться двух правил:\n" +
            "\n" +
            "Не писать слова вместе;\n" +
            "\n" +
            "Не разрывать слово пробелами или переходом на новую строку.\n" +
            "\n" +
            "В остальном компилятору все равно, как будет расположена программа, однако, это совсем не безразлично для программиста. Польза отступов в прояснении структуры программы. Взгляды на выбор отступов весьма различны, но все согласны в одном – отступы должны делать структуру программы максимально наглядной.\n" +
            "\n" +
            "Слова program, const, var, begin, end, а также множество других называются зарезервированными словами. Зарезервированные слова нельзя расширять (например, constant будет ошибкой) и сокращать (например, prog также будет ошибкой).\n" +
            "\n" +
            "Использовать в программном коде на Pascal можно как прописные, так и строчные буквы, а также их чередовать. Однако в строках (тип данных) разница между прописными и строчными буквами существует."),
    BODY_4("Типы данных в Паскале\n" +
            "\n" +
            "Любая программа, написанная на любом языке программирования, по большому счету предназначена для обработки данных. В качестве данных могут выступать числа, тексты, графика, звук и др. Одни данные являются исходными, другие – результатом, который получается путем обработки исходных данных программой.\n" +
            "\n" +
            "Данные хранятся в памяти компьютера. Программа обращается к ним с помощью имен переменных, связанных с участками памяти, где хранятся данные.\n" +
            "\n" +
            "Переменные описываются до основного кода программы. Для них указываются ее имя и тип хранимых данных.\n" +
            "\n" +
            "В языке программирования Паскаль достаточно много типов данных. Кроме того, сам пользователь может определять свои типы данных.\n" +
            "\n" +
            "Тип переменной определяется тем, с какими данными она связана.\n" +
            "\n" +
            "Переменные типа integer могут быть связаны только с целыми значениями обычно в диапазоне от -32768 до 32767. В Pascal есть другие целочисленные типы.\n" +
            "\n" +
            "Переменные типа real хранят вещественные (дробные) числа.\n" +
            "\n" +
            "Переменная булевского (логического) типа может принимать только два значения - true (1, правда) или false (0, ложь).\n" +
            "\n" +
            "Символьный тип (char) может принимать значения из определенной упорядоченной последовательности символов.\n" +
            "\n" +
            "Интервальный тип определяется пользователем и формируется только из порядковых типов. Представляет собой подмножество значений в конкретном диапазоне.\n" +
            "\n" +
            "Можно создать собственный тип данных простым перечислением значений, которые может принимать переменная данного типа. Это так называемый перечисляемый тип данных.\n" +
            "\n" +
            "Все вышеописанное – это простые типы данных. Но бывают и более сложные, структурированные, которые базируются на простых типах.\n" +
            "\n" +
            "Массив – это структура, занимающая в памяти единую область и состоящая из фиксированного числа компонентов одного типа.\n" +
            "\n" +
            "Строки представляет собой последовательность символов. Причем количество этих символов не может быть больше 255 включительно. Такое ограничение характерная черта Pascal.\n" +
            "\n" +
            "Запись – это структура, состоящая из фиксированного числа компонент, называемых полями. В разных полях данные могут иметь разный тип.\n" +
            "\n" +
            "Множества представляют собой совокупность любого числа элементов, но одного и того же перечисляемого типа.\n" +
            "\n" +
            "Файлы для Pascal представляют собой последовательности однотипных данных, которые хранятся на устройствах внешней памяти (кстати, жесткий диск – это тоже внешняя память).\n" +
            "\n" +
            "Понятие такого типа данных как указатель связано с динамическим хранением данных в памяти компьютера. Часто использование динамических типов данных является более эффективным в программирование, чем статических."),
    BODY_5("Вложенные конструкции if-else\n" +
            "\n" +
            "Следует быть внимательными при использовании вложенных операторов if. Предпочтительнее пользоваться схемой else-if (т.е. вкладывать во внешнюю ветку else), а не then-if (т.е не вкладывать во внешнюю ветку if). Так как в последнем случае придется следить за тем, к какой ветке относится соответствующее else. Пренебрежение этим правилом приводит к нагромождению закрывающих else.\n" +
            "\n" +
            "Сравните две программы ниже. Они делают одно и то же. Однако предпочтительной является первая.\n" +
            "\n" +
            "else-if\n" +
            "\n" +
            "var\n" +
            "\n" +
            "    a: integer;\n" +
            "\n" +
            " begin\n" +
            "\n" +
            "    write('Введите целое число: ');\n" +
            "\n" +
            "    readln(a);\n" +
            "\n" +
            "     if a = 0 then\n" +
            "\n" +
            "        writeln('zero')\n" +
            "\n" +
            "    else\n" +
            "\n" +
            "        if a = 1 then\n" +
            "\n" +
            "            writeln('one')\n" +
            "\n" +
            "        else\n" +
            "\n" +
            "            if a = 2 then\n" +
            "\n" +
            "                writeln('two')\n" +
            "\n" +
            "            else\n" +
            "\n" +
            "                writeln('unknown');\n" +
            "\n" +
            " readln\n" +
            "\n" +
            "end.\n" +
            "\n" +
            "then-if\n" +
            "\n" +
            "var\n" +
            "\n" +
            "    a: integer;\n" +
            "\n" +
            " begin\n" +
            "\n" +
            "    write('Введите целое число: ');\n" +
            "\n" +
            "    readln(a);\n" +
            "\n" +
            "     if a <> 0 then\n" +
            "\n" +
            "        if a <> 1 then\n" +
            "\n" +
            "            if a <> 2 then\n" +
            "\n" +
            "                writeln('unknown')\n" +
            "\n" +
            "            else\n" +
            "\n" +
            "                writeln('two')\n" +
            "\n" +
            "        else\n" +
            "\n" +
            "            writeln('one')\n" +
            "\n" +
            "    else\n" +
            "\n" +
            "        writeln('zero');\n" +
            "\n" +
            " readln\n" +
            "\n" +
            "end.\n" +
            "\n" +
            "При использовании второго варианта надо помнить следующее общее правило: каждый else относится к ближайшему предшествующему if, еще не имеющему парного else.\n" +
            "\n" +
            "При вложении в ветвь else (первый вариант) конструкция получается логически более понятной.\n" +
            "\n");

    private String body;

    Body(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}