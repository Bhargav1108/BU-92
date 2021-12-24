
function validate(){
    
    const Name=document.getElementById("1").value;
    const Pass=document.getElementById("2").value;
    const conpass=document.getElementById("3").value;
    const Email=document.getElementById("4").value;
    const Dob=document.getElementById("5").value;
    const gen=document.register.gender.value;
    const Mobile=Number(document.getElementById("6").value);
    const validregex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
    if(Name==null || Name==""){
        window.alert("Name Should not be null !");
    }
    if(Pass=="" || Pass.length<=8){
       window.alert("Password length should be min 8 "); 
    }
    else if(Pass != conpass){
        alert("Password must be same !!");
        return false;
    }
    else if( Mobile.length != 10){
        window.alert("phone number must be 10 digits");
    }
     else if(!Email.match(validRegex)){
        window.alert("Invalid Email");
    }  