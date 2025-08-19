const prompt = require('prompt-sync')()
function age(fatherAge, sonAge){
	let dadAge = prompt("Father age: ");
	let childAge = prompt("Son Age: ");

	let yearCount = 0;
	for (let age = 0; age < dadAge; age++){
		if (dadAge === age * 2){
			yearCount += age;
		}
	}
	return yearCount;

result = function age(fatherAge, sonAge)
console.log(result);

