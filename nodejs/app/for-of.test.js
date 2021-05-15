test('for-of continue', () => {
    let lists = [0, 1, 2, 3, 4 ];

    for (let item of lists) {
        if (item === 1) {
            continue;
        }
        console.log(item);
    }
});