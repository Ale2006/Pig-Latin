# Pig-Latin
Traductor de Ingles A Pig Latin
Con este proyecto busco ganar experiencia en un lenguaje nuevo para mi (JAVA), tratando de volcar todas las sugerencias para que sea mas ordenado y facil de leer, ademas de lograr la eficiencia y que no se repita codigo innecesario. La idea en un principio era recibir una cadena de texto por teclado, analisar cuantas palabras tenia en total a travez de una funcion *contadorPalabras(cadena)* que recibe por parametro el String cadena, este devuelve un int. Una vez que tengo la cantidad de palabras, hice un array, (por falta de experiencia, ya que usando un list<> o vector<>, no era necesaria la funcion para contar las palabras). Una vez que tengo el array dimensionado, uso la funcion *llenarArray(arrayCadena, cadena)*  que recibe el array y la cadena de texto original, de haber usado un list, no tenia la necesidad al llenar el array, la dimension. Por eso, se pasa por parametro el array, que tambien podria haber sido la cantidad de palabras. Este metodo devuelve un String [] con las palabras de la cadena, separadas. Ya con todo esto, se pasa a la funcion *traductor (String []array)*, dentro de la funcion, se separa palabra por palabra segun las reglas semanticas y se le aplica la traduccion. Esta funcion devuelve el array ya traducido y listo para que la funcion *mostrarArray(String[]cadena)* lo imprima por pantalla. 
Por el momento me encuentro con el problema de las palabras compuestas, la posible solucion seria cargar todas las posible palabras compuestas en un array o list<> y hacer la comparacion dentro de la funcion *traductor*, mientras tanto voy a seguir haciendo las modificaciones que me indicaron. Lo bueno de todo esto, mas alla que no es un proyecto super util,es poder trabajar o recibir indicaciones e ir solucionandolas asi como tambien llegar a un programa que funcione como yo esperaba. Como aporte al grupo, me gustaria dejar una libreria o diccionario, con todas las palabras compuestas en ingles, que eso si puede ser util. A medida que vaya haciendo cambios, los voy a ir reportando!! Saludos y gracias!!





Links utilizados para este proyecto.
https://www.wikihow.com/Speak-Pig-Latin  //semantica gramatical
https://www.aboutespanol.com/523-palabras-compuestas-en-ingles-que-debes-saber-a-k-1961083
https://www.aboutespanol.com/523-palabras-compuestas-en-ingles-que-debes-saber-a-k-1961083
