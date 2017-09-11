function kebabize(str) {
    let kebabized = '';
    
    for(let i of str)
      if(/^[a-z]+$/gmi.test(i))
        if(/^[A-Z]+$/gm.test(i)) kebabized += '-' + i.toLowerCase();
        else kebabized += i;
        
    if(kebabized.length > 0)
        return kebabized[0] === '-' ? kebabized.slice(1) : kebabized;
    else
        return '';
}