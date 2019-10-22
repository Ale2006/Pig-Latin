# Pig-Latin
Traductor de Ingles A Pig Latin
Con este proyecto busco ganar experiencia en un lenguaje nuevo para mi (JAVA), tratando de volcar todas las sugerencias para que sea mas ordenado y facil de leer, ademas de lograr la eficiencia y que no se repita codigo innecesario. La idea en un principio era recibir una cadena de texto por teclado, analisar cuantas palabras tenia en total a travez de una funcion *contadorPalabras(cadena)* que recibe por parametro el String cadena, este devuelve un int. Una vez que tengo la cantidad de palabras, hice un array, (por falta de experiencia, ya que usando un list<> o vector<>, no era necesaria la funcion para contar las palabras). Una vez que tengo el array dimensionado, uso la funcion *llenarArray(arrayCadena, cadena)*  que recibe el array y la cadena de texto original, de haber usado un list, no tenia la necesidad al llenar el array, la dimension. Por eso, se pasa por parametro el array, que tambien podria haber sido la cantidad de palabras. Este metodo devuelve un String [] con las palabras de la cadena, separadas. Ya con todo esto, se pasa a la funcion *traductor (String []array)*, dentro de la funcion, se separa palabra por palabra segun las reglas semanticas y se le aplica la traduccion. Esta funcion devuelve el array ya traducido y listo para que la funcion *mostrarArray(String[]cadena)* lo imprima por pantalla. 
Por el momento me encuentro con el problema de las palabras compuestas, la posible solucion seria cargar todas las posible palabras compuestas en un array o list<> y hacer la comparacion dentro de la funcion *traductor*, mientras tanto voy a seguir haciendo las modificaciones que me indicaron. Lo bueno de todo esto, mas alla que no es un proyecto super util,es poder trabajar o recibir indicaciones e ir solucionandolas asi como tambien llegar a un programa que funcione como yo esperaba. Como aporte al grupo, me gustaria dejar una libreria o diccionario, con todas las palabras compuestas en ingles, que eso si puede ser util. A medida que vaya haciendo cambios, los voy a ir reportando!! Saludos y gracias!!


Editado:
Como me habia indicado Mauricio, estaba bueno ponerle nombre a las expresiones, despues de renegar un rato, quedo asi:

boolean primerLetra=esVocal(array[i].substring(0,1));  

con esto logre que el codigo, dentro de las condicionales, quede mucho mas organizado y en el momento de hacer algun cambio, solo se hace en la variable. El problema lo tenia al momento de declarar el tipo de dato, cuando usaba var primerLetra, me generaba un error, hasta que se me paso por la cabeza que la expresion responde a un true o false. 
Cree una funcion para una sola palabra, esta vez use expresiones regulares para saber si empieza con vocal o si las primeras 2, son consonantes. A la hora de armar el String traducido, no use una variable aux como antes, esta vez, use las partes del String y concatene el final. Dejo las 2 funciones para que se note la diferencia y por si a alguien le interesa alguno de los 2 metodos para revisar las vocales. Dejo tambien el link de una pagina para probar las expresiones regulares.

String empiezaVocal="^[aeiou]{1}.*";//{1} indica el primer caracter, [aeiou] compara si tienealguna de estas letras .* tiene mas de un caracter sin especificar cuantos.
String dosConsonantes="^[^aeiou]{2}.*";  //el simbolo ^dentro de los corchetes, se usa como negador.


Me quedaria para la proxima actualizacion, unificar las 2 funciones, un txt con palabras de ejemplo y sus traducciones y el diccionario de palabras compuestas. 

Palabras de ejemplo:

hello,  ello-hay/
Pig Latin, ig-pay Atin-lay/
glove, ove-glay/
it, it-yay/
ultimate, ultimate-yay/
yellow ellow-yay/
rhythm, ythm-rhay/


Links utilizados para este proyecto.
https://repl.it/@Ale2006/Pig-Latin
https://www.wikihow.com/Speak-Pig-Latin  //semantica gramatical
https://www.aboutespanol.com/523-palabras-compuestas-en-ingles-que-debes-saber-a-k-1961083
https://www.aboutespanol.com/523-palabras-compuestas-en-ingles-que-debes-saber-a-k-1961083
https://regex101.com/
http://www.snowcrest.net/donnelly/piglatin.html
