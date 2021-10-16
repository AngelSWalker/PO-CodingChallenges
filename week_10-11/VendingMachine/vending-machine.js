const products = {
    1: { product: "Chips", price: 150 },
    2: { product: "Snicker", price: 120 },
    3: { product: "Skittles", price: 120 },
    4: { product: "Crackers", price: 100 },
    5: { product: "Gum", price: 50 },
};

function getChange(pay) {
    let coins = [500, 200, 100, 50, 20, 10];
    let change = [];
    let currentPay = pay;
  
    if (currentPay === 0) return 'Fully Paid.';
  
    for (let i = 0; i < coins.length; i++) {
      if (currentPay % coins[i] === 0) {
        let count = Math.floor(currentPay / coins[i]);
        for (let j = 0; j < count; j++) {
          change.push(coins[i]);
        }
        return change;
      } else {
        let count = Math.floor(currentPay / coins[i]);
        for (let k = 0; k < count; k++) {
          change.push(coins[i]);
        }
        currentPay = currentPay % coins[i];
      }
    }
  
    return change;
  }

function vendingMachine(productNum, pay) {
    if (!(productNum in products))
        return "Enter a valid product number";

    if (pay < products[productNum].price)
        return "Not enough money for this product";

    let totalChg = pay - products[productNum].price;
    let splitChg = getChange(totalChg);

    let productName = products[productNum].product;

    return { product: productName, change: splitChg};
}
  
  
  
  console.log(vendingMachine(1, 190));
  console.log(vendingMachine(3, 500));
  console.log(vendingMachine(4, 100));
  console.log(vendingMachine(5, 500));