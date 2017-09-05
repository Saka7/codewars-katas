const expression = (op, num) => op ? op(num) : num;
const zero = op => expression(op, 0);
const one = op => expression(op, 1);
const two = op => expression(op, 2);
const three = op => expression(op, 3);
const four = op => expression(op, 4);
const five = op => expression(op, 5);
const six = op => expression(op, 6);
const seven = op => expression(op, 7);
const eight = op => expression(op, 8);
const nine = op => expression(op, 9);

const plus = num => res => res + num;
const minus = num => res => res - num;
const times = num => res => res * num;
const dividedBy = num => res => res / num;