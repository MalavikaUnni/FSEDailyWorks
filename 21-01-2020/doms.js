class Hello
{
    constructor(fname,lname,age)
    {
        this.fn=fname;
        this.ln=lname;
        this.a=age;
    }

    full_name()
    {
        return this.fn + ' ' +this.ln
    }
}

let hello=new Hello('abin','Joshy',22);
console.log('Fullname :' +hello.full_name());