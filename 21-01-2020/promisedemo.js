// promise=new Promise(function(resolve,reject){
//     setTiimeout(resolve,5000)
// });
// promise.then(function(){
// console.log('this is done')
// })




// var asynchronousFunction=function()
// {
//     return new Promise(function(resolve,reject){
// console.log('Promise.....');
// setTimeout(resolve,5000)
//     })
// }
// asynchronousFunction()
//  .then(asynchronousFunction)
//  .then(asynchronousFunction)






// const myPromise = new Promise((resolve, reject) => {
//     if (Math.random() * 100 < 90) {
//         resolve('Hello, Promises!');
//     }
//     reject(new Error('In 10% of the cases, I fail. Miserably.'));
// });
// // Two functions 
// //const onResolved = (resolvedValue) => console.log(resolvedValue);
// const onRejected = (error) => console.log(error);
// function onResolved(resolvedValue)
// {
//     console.log(resolvedValue)
// }
// myPromise.then(onResolved, onRejected);

// Same as above, written concisely
// myPromise.then((resolvedValue) => {
//     console.log(resolvedValue);
// }, (error) => {
//     console.log(error);
// });



