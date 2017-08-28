const sumIntervals = intervals => {
  return intervals
    .sort((i1, i2) => i1[0] < i2[0] ? -1 : +(i1[0] > i2[0]))
    .reduce((acc, next) => {
      if (next[1] > acc.first) acc.all += next[1] - Math.max(next[0], acc.first);
      acc.first = Math.max(next[1], acc.first);
      return acc;
    }, {all: 0, first: 0}).all;
}