# Шаблоны проектирования

---

## *Порождающие шаблоны*

---

Шаблон: Фабрика (Factory Method)
-
**Цель**:<br/>

- Создание интерфейся, который создает объект. При этом, выбор того, экземпляр какого класса создавать остается за классами,
которые имплементируют данный интерфейс.

**Для чего используется**:<br/>

- Для делегирования создания экземпляров другому классу.

**Пример использования**:<br/>

- Заранее неизвестно, экземпляры какого класса нужно будет создавать;
- Класс спроектирован таким образом, что создаваемые им объекты имеют свойства определенного класса;

**UML Diagram Factory Method in example code**:<br/>

![UML Diagram Factory Method](src/main/resources/image/factoryMethod.png)

---

Шаблон: Абстрактная фабрика (Abstract Factory)
-
**Цель**:<br/>

- Создание интерфейся, для создания множества взаимосвязанных или взаимозависимых объектов, без жесткой привязке к конкретным классам.

**Для чего используется**:<br/>

- Для создания множества взаимосвязанных объектов.

**Пример использования**:<br/>

- Система не должна зависеть от метода создания, компоновки и представления входящих в неё объектов;
- Входящие взаимосвязанные объекты должны использоваться вместе;
- Система должна конфигурироваться одним из множества объектов, из которых она состоит;
- Нам необходимо представить множество объектов, раскрывая только их интерфейсы, но не реализацию;

**UML Diagram Abstract Factory in example code**:<br/>

![UML Diagram Abstract Factory](src/main/resources/image/abstractFactory.png)

---

Шаблон: Одиночка (Singleton)
-
**Цель**:<br/>

- Гарантировать, что у класса будет только один единственный экземпляр и к нему будет представлена глобальная точка доступа.

**Для чего используется**:<br/>

- Для создания единственного экземпляра определенного класса.

**Пример использования**:<br/>

- Необходим только один экземпляр определенного класса, который доступен для всех клиентов;
- Единственный экземпляр должен наследоваться путем порождения подклассов, при этом, клиенты имеют возможность 
  работать с классом-наследником без модификации своего кода;

**UML Diagram Singleton in example code**:<br/>

![UML Diagram Singleton](src/main/resources/image/singleton.png)

---

Шаблон: Строитель (Builder)
-
**Цель**:<br/>

- Отделить конструирование сложного объекта от его представления таким образом, чтобы в результате одного и того же
  конструирования мы могли получить разные представления.

**Для чего используется**:<br/>

- Для создания различных объектов из одного набора данных.

**Пример использования**:<br/>

- Порядок создания сложного объекта не должен зависеть от того, из каких частей состоит объект и того, 
  как эти объекты взаимосвязаны;
- Процесс конструирования объекта должен представлять различные представления объекта, который мы конструируем;

**UML Diagram Builder in example code**:<br/>

![UML Diagram Builder](src/main/resources/image/builder.png)

---

Шаблон: Прототип (Prototype)
-
**Цель**:<br/>

- Определить вид создаваемых объектов с помощью экземпляра - прототипа и создать новые объекты, копируя этот прототип.

**Для чего используется**:<br/>

- Для создания копий заданного объекта.

**Пример использования**:<br/>

- Классы, экземпляры которых необходимо создать, определяются во время выполнения программы;
- Для избежания построения иерархии классов, фабрик или параллельных иерархий классов;
- Экземпляры классов могут находится в одном из немногих возможных состояний;

**UML Diagram Prototype in example code**:<br/>

![UML Diagram Prototype](src/main/resources/image/prototype.png)

---

## *Структурные шаблоны*

---

Шаблон: Адаптер (Adapter)
-
**Цель**:<br/>

- Преобразование интерфейса одного класса в интерфейс того класса, который необходим клиенту.

**Для чего используется**:<br/>

- Для обеспечения совместной работы классов, интерфейсы которых не совместимы.

**Пример использования**:<br/>

- Интерфейс класса, который мы хотим использовать не соответствует нашим потребностям;
- Необходим класс, который должен взаимодействовать с классами, которые ему неизвестны или не связаны с ним;
- Необходимо использовать несколько существующих подклассов, но нецелесообразно использовать методы этих классов, создавая их новые подклассы;

**UML Diagram Adapter in example code**:<br/>

![UML Diagram Adapter](src/main/resources/image/adapter.png)

---
Шаблон: Мост (Bridge)
-
**Цель**:<br/>

- Отделить абстракцию от её реализации таким образом, чтобы мы могли изменять независимо друг от друга и то и другое.

**Для чего используется**:<br/>

- Для получения преимуществ наследования без потери гибкости.

**Пример использования**:<br/>

- Предотвращение жесткой привязки абстракции к реализации (например, реализацию необходимо выбрать во время выполнения программы);
- В будущем мы хотим расширять с помощью подклассов и реализацию и абстракцию;
- Если изменения в реализации не должны отражаться на клиентах абстракции;
- Для разделения одной реализации между несколькими объектами и не показывать это клиенту;

**UML Diagram Bridge in example code**:<br/>

![UML Diagram Bridge](src/main/resources/image/bridge.png)

---

Шаблон: Компоновщик (Composite)
-
**Цель**:<br/>

- Скомпонировать объекты в структуры по типу "дерева", позволяя клиентам единообразно трактовать отдельные и составные объекты.

**Для чего используется**:<br/>

- Для группировки мелких компонентов в более крупные, которые, в свою очередь, могут стать основной для ещё более крупных структур.

**Пример использования**:<br/>

- Для представления иерархии "часть-целое";
- Мы хотим, чтобы клиенты одним способом трактовали как отдельные, так и составные объекты;


**UML Diagram Composite in example code**:<br/>

![UML Diagram Composite](src/main/resources/image/) - неверная картинка

---

Шаблон: Декоратор (Decorator)
-
**Цель**:<br/>

- Динамическое добавление новых обязанностей объекту.

**Для чего используется**:<br/>

- Используется в качестве альтернативы порождению подклассов для расширения функциональности.

**Пример использования**:<br/>

- Динамическое и понятное клиентам добавление обязанностей объектам;
- Реализация обязанностей, которые могут быть сняты с объекта;
- Расширение класса путем порождения подклассов невозможно по каким-либо причинам;


**UML Diagram Decorator in example code**:<br/>

![UML Diagram Decorator](src/main/resources/image/decorator.png) 

---
 
Шаблон: Фасад (Facade)
-
**Цель**:<br/>

- Предоставить унифицированный интерфейс вместо нескольких интерфейсов подсистемы.

**Для чего используется**:<br/>

- Используется для определеения интерфейса высокого уровня, который упрощает использование подсистемы.

**Пример использования**:<br/>

- Изолирование клиентов от компонентов подсистемы, упрощая работу с ней;
- Необходимость ослабления связанности подсистемы с клиентами;


**UML Diagram Facade in example code**:<br/>

![UML Diagram Facade](src/main/resources/image/facade.png) 

---

Шаблон: Приспособленец (Flyweight)
-
**Цель**:<br/>

- Поддержка множества мелких объектов.

**Для чего используется**:<br/>

- Используется разделение для того, чтобы поддерживать много мелких объектов.

**Пример использования**:<br/>

- Когда используется большое число объектов;
- Большую часть состояния объектов можно вынести наружу;
- Приложение не зависит от идентичности объекта;


**UML Diagram Flyweight in example code**:<br/>

![UML Diagram Flyweight](src/main/resources/image/flyweight.png) 

---

Шаблон: Прокси (Proxy)
-
**Цель**:<br/>

- Для замещения другого объекта и контроля доступа к нему.

**Для чего используется**:<br/>

- Для обеспечения контроля доступа к определенному объекту.

**Пример использования**:<br/>

- Когда есть необходимость ссылаться на объект способом отличным от обычного указателя; 
  - *удаленное замещение* - локальный представитель вместо объекта в другом адресном пространстве.
  - *виртуальное замещение* - создание "тяжелых объектов" при необходимости.
  - *защищенное замещение* - контроль доступа к указанному объекту.
  - *"умная" ссылка* - замена обычного указателя (подсчет числа ссылок, установка блокировки и т.д.)


**UML Diagram Proxy in example code**:<br/>

![UML Diagram Proxy](src/main/resources/image/proxy.png) 

---

## *Поведенческие шаблоны*

---

Шаблон: Цепочка ответственности (Chain of Responsibility)
-
**Цель**:<br/>

- Связывание объектов-получателей в цепочку и передача запроса по ней.

**Для чего используется**:<br/>

- Помогает избежать привязки отправителя запроса к его получателю, что дает возможность обрабатывать данный запрос
  нескольким объектам.

**Пример использования**:<br/>

- Ослабление привязанности (объект не должен знать, кто именно обработает его запрос);
- Дополнительная гибкость при распределении обязанностей между объектами;


**UML Diagram Chain of Responsibility in example code**:<br/>

![UML Diagram Chain of Responsibility](src/main/resources/image/chainOfResponsibility.png) 

---

Шаблон: Команда (Command)
-
**Цель**:<br/>

- Инкапсулирование запроса в объект.

**Для чего используется**:<br/>

- Чтобы задать параметры клиентов для обработки определенных запросов, создание очереди из этих запросов
  или их контроля и поддержки операций.

**Пример использования**:<br/>

- Параметризация объектов выполняемым действием;
- Определить запрос, ставить его в очередь или выполнять его в разное время;


**UML Diagram Command in example code**:<br/>

![UML Diagram Command](src/main/resources/image/command.png) 

---

Шаблон: Интерпретатор (Interpreter)
-
**Цель**:<br/>

- Определение представления грамматики объекта.

**Для чего используется**:<br/>

- Используется для определения грамматики заданного языка и интерпретации его предложений.

**Пример использования**:<br/>

- Упрощение иерархии классов с помощью интерпретирования;

**UML Diagram Interpreter in example code**:<br/>

![UML Diagram Interpreter](src/main/resources/image/interpreter.png) 

---

Шаблон: Итератор (Iterator)
-
**Цель**:<br/>

- Получение последовательного доступа ко всем элементам составного объекта.

**Для чего используется**:<br/>

- Для получения последовательного доступа ко всем элементам составного объекта, скрывая его внутреннее представление.

**Пример использования**:<br/>

- Различные виды обхода составного объекта;
- Упрощенный доступ к составному объекту;

**UML Diagram Iterator in example code**:<br/>

![UML Diagram Iterator](src/main/resources/image/iterator.png) 

---

Шаблон: Посредник (Mediator)
-
**Цель**:<br/>

- Инкапсуляция способа взаимодействия множества объектов.

**Для чего используется**:<br/>

- Для определения объекта, который инкапсулирует способ взаимодействия множества объектов и обеспечения слабой связи между этими объектами.

**Пример использования**:<br/>

- Связи между объектами сложны и чётко определены;
- Нельзя повторно использовать объект, так как он обменивается информацией с другими объектами;
- Поведение, распределенное между несколькими классами должно легко настраиваться без создания подклассов;

**UML Diagram Mediator in example code**:<br/>

![UML Diagram Mediator](src/main/resources/image/mediator.png) 

---

Шаблон: Хранитель (Memento)
-
**Цель**:<br/>

- Сохранить внутреннее состояние объекта за его пределы.

**Для чего используется**:<br/>

- Фиксирование внутреннего состояния объекта за его пределами не нарушая инкапсуляцию и востановления объекта в случае необходимости.

**Пример использования**:<br/>

- Необходимо сохранить текущее состояние объекта или его части и восстановление в будущем, но прямое получение состояния раскрывает детали реализации 
  и нарушает инкапсуляцию объекта;

**UML Diagram Memento in example code**:<br/>

![UML Diagram Memento](src/main/resources/image/memento.png) 

---

Шаблон: Наблюдатель (Observer)
-
**Цель**:<br/>

- Определение зависимости "один ко многим" между объектами.

**Для чего используется**:<br/>

- Определение зависимости "один ко многим" между объектами таким образом, что при изменении состояния одного объекта все зависящие от него объекты 
  были уведомлены об этом и обновились.

**Пример использования**:<br/>

- Когда у модели имеются два аспекта, один из которых зависит от другого. Инкапсулирование этих аспектов в разные классы позволяют использовать 
  их независимо друг от друга;
- Когда один объект должен оповещать другие и не делать предположений об этих объектах;
- Ослабление связи между объектами;

**UML Diagram Observer in example code**:<br/>

![UML Diagram Observer](src/main/resources/image/observer.png) 

---

Шаблон: Состояние (State)
-
**Цель**:<br/>

- Управление поведением объекта в зависимости от состояния.

**Для чего используется**:<br/>

- Позволяет нам управлять поведением объекта в зависимости от внутреннего состояния объекта.

**Пример использования**:<br/>

- Поведение объекта зависит от его состояние и изменяется во время выполнения;
- Когда встречается большое количество условных операторов, когда выбор ветви зависит от состояния объекта;

**UML Diagram State in example code**:<br/>

![UML Diagram State](src/main/resources/image/state.png) 

---

Шаблон: Стратегия (Strategy)
-
**Цель**:<br/>

- Взаимозаменяемость семейства классов.

**Для чего используется**:<br/>

- Определение семейства классов, инкапсулирование каждого из них и организация их взаимозаменяемости.

**Пример использования**:<br/>

- Есть несколько родственных классов, которые отличаются поведением;
- Необходимо иметь несколько вариантов поведения;
- В классе есть данные, о которых не должен знать клиент;
- С помощью условных операторов в классе определено большое количество возможных поведений;

**UML Diagram Strategy in example code**:<br/>

![UML Diagram Strategy](src/main/resources/image/strategy.png) 

---

Шаблон: Шаблонный метод (Template method)
-
**Цель**:<br/>

- Определение основы класса и создание возможности подклассам переопределять его части.

**Для чего используется**:<br/>

- Определяет основу класса и позволяет подклассам переопределять некоторые его части 
  не изменяя его структуру в целом.

**Пример использования**:<br/>

- Однократное использование различных частей класса, оставляя реализацию изменяющегося поведения 
  на усмотрение подклассов;
- Вычленение и локализация общего для всех подклассов поведения в родительском;
- Управление расширениями подклассов;

**UML Diagram Template method in example code**:<br/>

![UML Diagram Template method](src/main/resources/image/templateMethod.png) 

---

Шаблон: Посетитель (Visitor)
-
**Цель**:<br/>

- Описание действий, которые выполняются с каждым объектом в некоторой структуре.

**Для чего используется**:<br/>

- Описание операций, которые выполняются с каждым объектом из некоторой структуры.
Позволяет определить новую операцию без изменения классов этих объектов.

**Пример использования**:<br/>

- В структуре присутствуют объекты многих классов с различными интерфейсами и нам
  необходимо выполнить над ними операции, которые зависят от конкретных классов;
- Необходимо выполнять не связанные между собой операции над объектами, которые 
  входят в состав структуры и мы не хотим добавлять эти операции в классы;
- Классы, которые устанавливают структуру объектов редко изменяются, но часто добавляются
  новые операции над этой структурой;

**UML Diagram Visitor in example code**:<br/>

![UML Diagram Visitor](src/main/resources/image/visitor.png)

---