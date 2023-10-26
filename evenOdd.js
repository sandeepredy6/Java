let num= 12457389
let r
let evenSum=0
let oddSum=0
while(num != 0) {
    r = num % 10
    num = num / 10
    num = parseInt(num,10)
    if( r%2 ==0){
     evenSum=evenSum+r
}
else{
    oddSum=oddSum+r
   }
}
console.log("evenSum--->"+evenSum)
console.log("oddSum--->"+oddSum)