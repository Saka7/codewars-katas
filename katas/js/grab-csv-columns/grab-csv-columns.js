function csvColumns(csv, indices){
  let result = '';
  let rows = csv.split('\n').map(row => row.split(','))
    
  rows.forEach((row, rowIndex) => {
    indices.forEach(col => {
      if(col < row.length) result += row[col];
      if(col < row.length - 2) result += ',';
    });
    if(rowIndex < rows.length - 1) result += '\n';
  });
  
  return result.replace(/\n*\n$/gm, '');
}