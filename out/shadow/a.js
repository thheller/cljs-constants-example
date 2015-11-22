var of = new w(null, "TEST-KEYWORD", "TEST-KEYWORD", -335893529), pf = new w("cljs-constants.a", "TEST-KEYWORD", "cljs-constants.a/TEST-KEYWORD", 2132546050), ka = function() {
  function a(a) {
    var d = null;
    if (0 < arguments.length) {
      for (var d = 0, e = Array(arguments.length - 0);d < e.length;) {
        e[d] = arguments[d + 0], ++d;
      }
      d = new N(e, 0);
    }
    return b.call(this, d);
  }
  function b(a) {
    return console.log.apply(console, Aa.b ? Aa.b(a) : Aa.call(null, a));
  }
  a.B = 0;
  a.L = function(a) {
    a = O(a);
    return b(a);
  };
  a.u = b;
  return a;
}(), la = function() {
  function a(a) {
    var d = null;
    if (0 < arguments.length) {
      for (var d = 0, e = Array(arguments.length - 0);d < e.length;) {
        e[d] = arguments[d + 0], ++d;
      }
      d = new N(e, 0);
    }
    return b.call(this, d);
  }
  function b(a) {
    return console.error.apply(console, Aa.b ? Aa.b(a) : Aa.call(null, a));
  }
  a.B = 0;
  a.L = function(a) {
    a = O(a);
    return b(a);
  };
  a.u = b;
  return a;
}();
console.log(pf);
console.log(of);
