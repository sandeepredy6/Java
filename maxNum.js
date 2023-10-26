let a=600
let b=300
let c=23
let max,min

if(a>b){
    max=a
    min=b
}
else{
    max=b
    min=a
}
if(c>max) max=c
if(c<min) min=c
console.log("max---->"+max)
console.log("min---->"+min)