var a = 0;
var b = 0;
var method

function op(value) {
    if (value == '0') { a = 0 }
    if (value == '1') { a = 1 }
    if (value =='2') { a = 2 }
    if (value == '3') { a = 3 }
    if (value == '4') { a = 4 }
    if (value == '5') { a = 5 }
    if (value == '6') { a = 6 }
    if (value == '7') { a = 7 }
    if (value == '8') { a = 8 }
    if (value == '9') { a = 9 }
    if (value == 'p') { 
        method = 'p'
        b = a
    }
    if (value == 'm') { 
        method = 'm'
        b = a
    }
    if (value == 't') { 
        method = 't'
        b = a
    }
    if (value == 'd') { 
        method = 'd'
        b = a
    }
    if (value == 'total') { 
        if (method == 'p') { b = b + a}
        if (method == 'm') { b = b - a}
        if (method == 't') { b = b * a}
        if (method == 'd') { b = b / a}
        var c = b;
    }
    document.getElementById('output')[0].value = c;
}