const add = (...args) => args.reduce((a, n, i) => a + n * (i + 1), 0);
