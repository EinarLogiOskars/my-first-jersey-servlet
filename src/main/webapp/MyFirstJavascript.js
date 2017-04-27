function createUserHTML() {


document.getElementById('ifrm').src = "createuserhtml.html";
//$(div2).load(createuserhtml.html);
}

function createUser(){
    var navn = document.getElementById('Name').itemValue;
    var init = document.getElementById('init').itemValue;
    var CPR = document.getElementById('CPR').itemValue;
    var password = document.getElementById('password').itemValue;
    
    
}

function initshowusers() {
$("div2").load("showusers.php");

}

function showusers() {
$("div2").load("showusers.php");    
}

function updateUserHTML(){
document.getElementById('ifrm').src = "UpdateUser2html.html"
}

function deleteUserHTML(){
document.getElementById('ifrm').src = "deleteuserhtml.html";    
}
