let str1 = "coming bringing Letting sing";
let str2 = "going Ping, king sHrink dOing";
let str3 = "zing went ring, ding wing SINk";
//Call function
console.log(ingExtractor(str1));
console.log(ingExtractor(str2));
console.log(ingExtractor(str3));

//function to return only non mono-syllabic words
function ingExtractor(string){
    var input= string.replace(/[^\w\s]/gi, '');
    //This will split the String into an array so we can check the length of the strings -source link-https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/split
    const array = input.split(" ");
    //New Array to be returned
    let returnString = new Array();
    //calls function to check length of the word
    array.forEach(lengthCheck);

    //Function to check the length of each word to make sure its not a mono-syllabic as well as checks to make sure it ends with "ing"
    function lengthCheck(item, index){
        //check length
        if(item.length >=5){
            //checks to make sure it ends with ing
             if(item.includes("ing")){
                returnString.push(item)
            } 
        }
    }
    return returnString;
}