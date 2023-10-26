let num = 8769
let p=1
let d=0
let r;
while(num != 0){
    r = num % 10
    num = num / 10
    num = parseInt(num,10)
    if(r == 7){ 
        r=0;
  
      }  else{
    d = d + r * p
    p = p * 10
 }
      }
console.log("new number--->"+d)