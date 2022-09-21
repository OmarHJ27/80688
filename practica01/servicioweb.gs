<<<<<<< HEAD
const doGet = (e = {}) => {
const { parameter } = e;
const { nombre = 'Arnold', apellido = 'GetSchwarzenegger', dir = 'california', tel = '696969'} = parameter;
const salida = `Hola ${nombre} ${apellido} ${dir} ${tel}`;
return ContentService.createTextOutput(salida);
};
// regresa de forma textual los parámetros leidos con post
const doPost = (e = {}) => {
const { parameter } = e;
const { nombre = 'Arnold', apellido = 'PostSchwarzenegger', dir = 'california', tel = '696969'} = parameter;
const salida = `Hola ${nombre} ${apellido} ${dir} ${tel}`;
return ContentService.createTextOutput(salida);
=======
const doGet = (e = {}) => {
const { parameter } = e;
const { nombre = 'Arnold', apellido = 'GetSchwarzenegger', dir = 'california', tel = '696969'} = parameter;
const salida = `Hola ${nombre} ${apellido} ${dir} ${tel}`;
return ContentService.createTextOutput(salida);
};
// regresa de forma textual los parámetros leidos con post
const doPost = (e = {}) => {
const { parameter } = e;
const { nombre = 'Arnold', apellido = 'PostSchwarzenegger', dir = 'california', tel = '696969'} = parameter;
const salida = `Hola ${nombre} ${apellido} ${dir} ${tel}`;
return ContentService.createTextOutput(salida);
>>>>>>> fced0dee40b44d107f16010d01f4d9cf58c153f1
};