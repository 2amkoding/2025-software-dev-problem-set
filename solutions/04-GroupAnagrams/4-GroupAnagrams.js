var groupAnagrams = function(strs) {

    const anaMap = {};

    for (let s of strs) {

        const count = new Array(26).fill(0);

        for(let c of s) {
            count[c.charCodeAt(0) - 'a'.charCodeAt(0)] += 1;

        }

        const key = count.join(',');

        if (!anaMap[key]) {
            anaMap[key] = [];
        }
        anaMap[key].push(s);
    }
    return Object.values(anaMap);
};

