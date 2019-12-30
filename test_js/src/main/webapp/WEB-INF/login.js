
    function validate_form() {
        if (document.emp.emp_name.value == "") {
            alert("Please fill in the 'Your Employee Name' box.");
            return false;
        }
        if (document.emp.num.value == "") {
            alert("Enter Employee Number");
            return false;
        }
        alert("sucessfully Submitted");



        if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/).test(document.emp.email_id.value)) {
            alert("You have entered an invalid email address!")
            return (false)
        }
    }

function isNumberKey(evt)
{
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if ((charCode != 46 && charCode > 31) && (charCode < 48 || charCode > 57)) {
        alert("Enter Number");
        return false;
    }
    return true;
}


