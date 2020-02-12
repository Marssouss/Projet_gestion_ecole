/**
 * 
 */

$(function() {
	$("#tabs").tabs();
});

PrimeFaces.locales['fr'] = {
	closeText : 'Fermer',
	prevText : 'Précédent',
	nextText : 'Suivant',
	monthNames : [ 'Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin',
			'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre',
			'Décembre' ],
	monthNamesShort : [ 'Jan', 'Feb', 'Mar', 'Avr', 'Mai', 'Jun', 'Jul', 'Aou',
			'Sep', 'Oct', 'Nov', 'Dec' ],
	dayNames : [ 'Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi',
			'Vendredi', 'Samedi' ],
	dayNamesShort : [ 'Dim', 'Lun', 'Mar', 'Mer', 'Jeu', 'Ven', 'Sam' ],
	dayNamesMin : [ 'D', 'L', 'M', 'M', 'J', 'V', 'S' ],
	weekHeader : 'Semaine',
	firstDayOfWeek : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Sólo hora',
	timeText : 'Tiempo',
	hourText : 'Hora',
	minuteText : 'Minuto',
	secondText : 'Segundo',
	currentText : 'Fecha actual',
	ampm : false,
	month : 'Mes',
	week : 'Semana',
	day : 'Día',
	allDayText : 'Todo el día'
};

PrimeFaces.locales['es'] = {
	closeText : 'Cerrar',
	prevText : 'Anterior',
	nextText : 'Siguiente',
	monthNames : [ 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
			'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre',
			'Diciembre' ],
	monthNamesShort : [ 'Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago',
			'Sep', 'Oct', 'Nov', 'Dic' ],
	dayNames : [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves',
			'Viernes', 'Sábado' ],
	dayNamesShort : [ 'Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab' ],
	dayNamesMin : [ 'D', 'L', 'M', 'X', 'J', 'V', 'S' ],
	weekHeader : 'Semana',
	firstDayOfWeek : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Sólo hora',
	timeText : 'Tiempo',
	hourText : 'Hora',
	minuteText : 'Minuto',
	secondText : 'Segundo',
	currentText : 'Fecha actual',
	ampm : false,
	month : 'Mes',
	week : 'Semana',
	day : 'Día',
	allDayText : 'Todo el día'
};
PrimeFaces.locales['de'] = {
	closeText : 'Schließen',
	prevText : 'Zurück',
	nextText : 'Weiter',
	monthNames : [ 'Januar', 'Februar', 'März', 'April', 'Mai', 'Juni', 'Juli',
			'August', 'September', 'Oktober', 'November', 'Dezember' ],
	monthNamesShort : [ 'Jan', 'Feb', 'Mär', 'Apr', 'Mai', 'Jun', 'Jul', 'Aug',
			'Sep', 'Okt', 'Nov', 'Dez' ],
	dayNames : [ 'Sonntag', 'Montag', 'Dienstag', 'Mittwoch', 'Donnerstag',
			'Freitag', 'Samstag' ],
	dayNamesShort : [ 'Son', 'Mon', 'Die', 'Mit', 'Don', 'Fre', 'Sam' ],
	dayNamesMin : [ 'S', 'M', 'D', 'M ', 'D', 'F ', 'S' ],
	weekHeader : 'Woche',
	firstDay : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Nur Zeit',
	timeText : 'Zeit',
	hourText : 'Stunde',
	minuteText : 'Minute',
	secondText : 'Sekunde',
	currentText : 'Aktuelles Datum',
	ampm : false,
	month : 'Monat',
	week : 'Woche',
	day : 'Tag',
	allDayText : 'Ganzer Tag'
};

// <![CDATA[
function dateTemplateFunc(date) {
	return '<span style="background-color:'
			+ ((date.day < 21 && date.day > 10) ? '#81C784' : 'inherit')
			+ ';border-radius:50%;padding: .25em;width: 1.75em; height:1.75em; display:block;">'
			+ date.day + '</span>';
}
// ]]>

function handleDrop(event, ui) {
    var droppedCar = ui.draggable;

    droppedCar.fadeOut('fast');
}
