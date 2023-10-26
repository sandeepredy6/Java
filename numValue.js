let num = 36478965
let r
let sum =0
while(num != 0){
        r = num % 10
    num = num / 10
    num = parseInt(num,10)
    sum = sum + r
}

console.log("sum--->"+sum)