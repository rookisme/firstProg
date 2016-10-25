function Student(elName, elCourse, elStudentID, nOfTmas) {
	this.name = elName;
	this.course = elCourse;
	this.studentId = elStudentID;
	this.tmaScores = new Array(nOfTmas);
	this.updateTma = updateTmaScores;
	this.display = displayStudent;
        this.displayAverage = tmaAverageScore;
};
function updateTmaScores(elTmaNo, elScore) {
	this.tmaScores [elTmaNo - 1] = elScore;
};
function displayStudent() {
	document.write("Name: " + this.name + "     " + "Course: " + this.course + '<BR>');
	document.write("Student ID: " + this.studentId + "<BR>");
	document.write("TMA Scores: " + this.tmaScores.toString() + '<BR>');
};
function tmaAverageScore() {
    for (var i = 0; this.tmaScores.length > i; i++) {
        var total = 0;
    total = total + this.tmaScores [i]; }
    var average = total / this.tmaScores.length;
    document.write("TMA average score for " + this.name + ": "+ average + '<BR>');
};