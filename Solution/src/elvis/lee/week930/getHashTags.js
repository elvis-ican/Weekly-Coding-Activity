function getHashTags(s) {
    let words = s.replaceAll(',', '').split(' ');
    words.sort((a, b) => b.length - a.length);
    let tags = [];
    for (let i = 0; i < 3 && i < words.length; i++) {
        tags.push('#' + words[i].toLowerCase());
    }
    return tags;
}

console.log(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year"));
console.log(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit"));
console.log(getHashTags("Visualizing Science"));