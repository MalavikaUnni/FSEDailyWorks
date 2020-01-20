
// let name='Amit'
// const name= 'Rahul'

/*function test() {
    for(var index=0;index<5;index++){
    console.log('Index :' +index)
    }
    console.log('Value of index :' +index)
}*/

// function test() 
// {
//    for(let index=0;index<5;index++)
//     {
//         console.log('Index :'+index)
//     }

// }
// console.log('Name :' +name)
// test()

// const sum=function(a,b)
// {
//     return a+b;
// }
// console.log('Sum :' +sum(5,3))


// function fun1(...params) { 
//     console.log(params.length); 
//  }  
//  fun1(0,9,8,3,4,5,6);  
//  fun1(5); 
//  fun1(5, 6, 7); 

// var func = new Function("x", "y", "return x*y;"); 
// function product() { 
//    var result; 
//    result = func(10,20); 
//    console.log("The product : "+result)
// } 
// product()



// (function() { 
//     var msg = "Hello World" 
//     console.log(msg)
//  } )
//  ()



//Lambda statement
var msg = ()=> {
    console.log('function invoked')
}
msg()