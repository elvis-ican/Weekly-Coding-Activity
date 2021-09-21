function getHashTags(s) {
    let words = s.replaceAll(',', '').split(' ');
    words.sort((a, b) => b.length - a.length);
    var tags;
    if (words.length < 3) {
        tags = words;
    } else {
        tags = words.slice(0, 3);
    }
    for (let t of tags) {
        t = '#' + t.toLowerCase();
    }
    return tags;
}