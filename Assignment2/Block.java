public class Block {
    static final String grass[][] = {
        {"#5eb635","#60b838","#5db534","#4ea823","#4ea823","#58b12f","#47a119","#55ae2b","#68c041","#60b838","#53ac29","#4fa925","#52ab27","#49a31c","#359200","#56af2d"},
        {"#5fb736","#55ae2b","#7cbb4a","#73b240","#75b443","#5e3b25","#51aa26","#4aa41d","#47a119","#85c454","#82c151","#5db534","#49a31c","#55ae2b","#4fa925","#54ad2a"},
        {"#7fbe4e","#5e3b25","#8fcd5e","#4ca620","#52ab27","#5e3b25","#59b230","#5e3b25","#5eb635","#6ac142","#84c353","#89c858","#5e3b25","#3d9909","#48a21a","#5e3b25"},
        {"#5e3b25","#6c6c6c","#5e3b25","#5e3b25","#5ab332","#5e3b25","#5e3b25","#5e3b25","#47a119","#5e3b25","#56af2d","#5e3b25","#7f5335","#5e3b25","#5e3b25","#7f5335"},
        {"#9e6a44","#7f5335","#9e6a44","#c28254","#5e3b25","#9e6a44","#7f5335","#7f5335","#5e3b25","#5e3b25","#5e3b25","#6c6c6c","#7f5335","#9e6a44","#5e3b25","#7f5335"},
        {"#7f5335","#5e3b25","#9e6a44","#9e6a44","#7f5335","#9e6a44","#5e3b25","#5e3b25","#5e3b25","#7f5335","#7f5335","#5e3b25","#7f5335","#7f5335","#7f5335","#c28254"},
        {"#c28254","#7f5335","#7f5335","#7f5335","#878787","#7f5335","#7f5335","#c28254","#c28254","#7f5335","#c28254","#c28254","#7f5335","#9e6a44","#7f5335","#9e6a44"},
        {"#7f5335","#7f5335","#c28254","#c28254","#9e6a44","#9e6a44","#7f5335","#7f5335","#9e6a44","#5e3b25","#9e6a44","#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44"},
        {"#9e6a44","#7f5335","#7f5335","#9e6a44","#7f5335","#9e6a44","#7f5335","#5e3b25","#7f5335","#9e6a44","#9e6a44","#7f5335","#7f5335","#7f5335","#5e3b25","#7f5335"},
        {"#7f5335","#9e6a44","#5e3b25","#7f5335","#7f5335","#5e3b25","#5e3b25","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#c28254","#c28254","#7f5335","#9e6a44"},
        {"#7f5335","#9e6a44","#7f5335","#c28254","#c28254","#7f5335","#c28254","#9e6a44","#5e3b25","#c28254","#c28254","#5e3b25","#9e6a44","#9e6a44","#878787","#7f5335"},
        {"#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44","#c28254","#7f5335","#9e6a44","#6c6c6c","#9e6a44","#9e6a44","#7f5335","#5e3b25","#9e6a44","#7f5335","#5e3b25"},
        {"#7f5335","#5e3b25","#9e6a44","#7f5335","#9e6a44","#9e6a44","#c28254","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#c28254","#c28254"},
        {"#7f5335","#9e6a44","#7f5335","#7f5335","#795741","#7f5335","#9e6a44","#9e6a44","#7f5335","#5e3b25","#c28254","#5e3b25","#7f5335","#c28254","#9e6a44","#9e6a44"},
        {"#9e6a44","#7f5335","#5e3b25","#c28254","#7f5335","#5e3b25","#7f5335","#5e3b25","#c28254","#c28254","#7f5335","#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44"},
        {"#9e6a44","#7f5335","#c28254","#9e6a44","#9e6a44","#7f5335","#878787","#7f5335","#9e6a44","#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44","#7f5335","#5e3b25"}
    };

    static final String dirt[][] = {
        {"#c28254","#9e6a44","#9e6a44","#7f5335","#7f5335","#c28254","#9e6a44","#9e6a44","#7f5335","#7f5335","#5e3b25","#7f5335","#7f5335","#c28254","#7f5335","#c28254"},
        {"#7f5335","#9e6a44","#5e3b25","#7f5335","#7f5335","#9e6a44","#878787","#5e3b25","#7f5335","#c28254","#9e6a44","#7f5335","#c28254","#9e6a44","#5e3b25","#5e3b25"},
        {"#c28254","#7f5335","#7f5335","#5e3b25","#c28254","#7f5335","#7f5335","#7f5335","#c28254","#7f5335","#7f5335","#7f5335","#5e3b25","#5e3b25","#c28254","#7f5335"},
        {"#9e6a44","#6c6c6c","#c28254","#7f5335","#9e6a44","#5e3b25","#7f5335","#c28254","#9e6a44","#9e6a44","#7f5335","#9e6a44","#7f5335","#c28254","#9e6a44","#7f5335"},
        {"#9e6a44","#7f5335","#9e6a44","#c28254","#5e3b25","#9e6a44","#7f5335","#7f5335","#9e6a44","#5e3b25","#7f5335","#6c6c6c","#7f5335","#9e6a44","#5e3b25","#7f5335"},
        {"#7f5335","#5e3b25","#9e6a44","#9e6a44","#7f5335","#9e6a44","#5e3b25","#5e3b25","#5e3b25","#7f5335","#7f5335","#5e3b25","#7f5335","#7f5335","#7f5335","#c28254"},
        {"#c28254","#7f5335","#7f5335","#7f5335","#878787","#7f5335","#7f5335","#c28254","#c28254","#7f5335","#c28254","#c28254","#7f5335","#9e6a44","#7f5335","#9e6a44"},
        {"#7f5335","#7f5335","#c28254","#c28254","#9e6a44","#9e6a44","#7f5335","#7f5335","#9e6a44","#5e3b25","#9e6a44","#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44"},
        {"#9e6a44","#7f5335","#7f5335","#9e6a44","#7f5335","#9e6a44","#7f5335","#5e3b25","#7f5335","#9e6a44","#9e6a44","#7f5335","#7f5335","#7f5335","#5e3b25","#7f5335"},
        {"#7f5335","#9e6a44","#5e3b25","#7f5335","#7f5335","#5e3b25","#5e3b25","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#c28254","#c28254","#7f5335","#9e6a44"},
        {"#7f5335","#9e6a44","#7f5335","#c28254","#c28254","#7f5335","#c28254","#9e6a44","#5e3b25","#c28254","#c28254","#5e3b25","#9e6a44","#9e6a44","#878787","#7f5335"},
        {"#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44","#c28254","#7f5335","#9e6a44","#6c6c6c","#9e6a44","#9e6a44","#7f5335","#5e3b25","#9e6a44","#7f5335","#5e3b25"},
        {"#7f5335","#5e3b25","#9e6a44","#7f5335","#9e6a44","#9e6a44","#c28254","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#7f5335","#c28254","#c28254"},
        {"#7f5335","#9e6a44","#7f5335","#7f5335","#795741","#7f5335","#9e6a44","#9e6a44","#7f5335","#5e3b25","#c28254","#5e3b25","#7f5335","#c28254","#9e6a44","#9e6a44"},
        {"#9e6a44","#7f5335","#5e3b25","#c28254","#7f5335","#5e3b25","#7f5335","#5e3b25","#c28254","#c28254","#7f5335","#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44"},
        {"#9e6a44","#7f5335","#c28254","#9e6a44","#9e6a44","#7f5335","#878787","#7f5335","#9e6a44","#9e6a44","#7f5335","#7f5335","#9e6a44","#9e6a44","#7f5335","#5e3b25"}
    };

    static final String dandelion[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ffec4f","#ffec4f","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ffec4f","#fed639","#f19d25","#ffec4f","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ffec4f","#f19d25","#ffec4f","#bd6a22","#fed639","#ffec4f","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ffec4f","#bd6a22","#fed639","#ffec4f","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#4a8f28","#55ab2d","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#55ab2d","#4a8f28","#4a8f28","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#177c04","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"}
    };

    static final String poppy[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ed302c","#9b221a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ed302c","#bf2529","#9b221a","#ed302c","#bf2529","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ed302c","#bf2529","#742303","#bf2529","#ed302c","#9b221a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ed302c","#ed302c","#ed302c","#ed302c","#9b221a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#bf2529","#204626","#265a25","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#204626","#265a25","#xxxxxx","#2b702a","#xxxxxx","#265a25","#265a25","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#204626","#xxxxxx","#204626","#204626","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#204626","#265a25","#204626","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"}
    };

    static final String redTulip[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ed302c","#xxxxxx","#ed302c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#ed302c","#ff4540","#bf2529","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#xxxxxx","#bf2529","#ed302c","#9b221a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#529a2e","#xxxxxx","#9b221a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#529a2e","#55ab2d","#177c04","#529a2e","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#4a8f28","#55ab2d","#xxxxxx","#xxxxxx","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#529a2e","#xxxxxx","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#529a2e","#4a8f28","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#4a8f28","#529a2e","#529a2e","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#4a8f28","#55ab2d","#4a8f28","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#529a2e","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"}
    };

    static final String orangeTulip[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#f19d25","#xxxxxx","#f19d25","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#f19d25","#f19d25","#d37d32","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#bd6a22","#d37d32","#bd6a22","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#bd6a22","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#177c04","#529a2e","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#xxxxxx","#4a8f28","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#4a8f28","#177c04","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#529a2e","#55ab2d","#177c04","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#4a8f28","#529a2e","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#177c04","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"}
    };

    static final String dirtForPlant[][] = {
        {"#703e16","#572e10","#713c15","#6f3c17","#572e10","#713c15","#552d0f","#6f3c17","#6f3c17","#6f3c17","#572e10","#572e10","#6f3c17","#572e10","#6d3d15","#6d3d19"},
        {"#552f10","#552f10","#552f10","#402109","#552f10","#402109","#552f10","#552f10","#552f10","#552f10","#6f3d15","#552f10","#552f10","#552f10","#41200b","#6d3d17"},
        {"#412009","#402109","#402109","#552f10","#402109","#402109","#402109","#402109","#402109","#552f10","#552f10","#412009","#402109","#402109","#552f10","#41220f"},
        {"#5a3d29","#5a3d29","#402109","#402109","#402109","#5d3e2a","#402109","#5a3d29","#402109","#402109","#402109","#402109","#5b3d27","#402109","#402109","#5a3d29"},
        {"#966c4a","#7a5639","#5a3d2b","#5a3d29","#402109","#5b3c29","#5a3d29","#5a3d29","#5a3d29","#5a3d29","#402109","#5a3d29","#5a3d29","#5a3d29","#5a3d29","#7a553d"},
        {"#78563b","#5b3d27","#966b4c","#966b4c","#5d3e28","#5b3e2a","#7a553b","#966c48","#ba855c","#5a3d29","#5b3e2a","#966b4c","#7a553d","#7a553d","#5a3d29","#ba855c"},
        {"#ba855c","#7a553b","#7a553b","#7a553b","#878787","#7a553b","#7a553b","#ba855c","#bb845e","#7a553b","#ba865a","#ba855c","#7a553d","#966c4a","#7a533a","#966c4a"},
        {"#7b543b","#7b5539","#ba855c","#ba855c","#966c48","#966e4b","#7a553b","#7b563c","#966e4b","#5b3c29","#986b48","#986b4a","#7a553d","#7a553b","#966b4c","#966c4a"},
        {"#966c4a","#7b5539","#7a553b","#976d4b","#7b543b","#966c4a","#7a553b","#5b3c29","#7a553d","#966c4a","#966c4a","#7a553b","#7a553b","#7a553b","#5a3d2b","#7a553d"},
        {"#7a553b","#966c4a","#5a3d29","#78563b","#78563b","#5a3e27","#5a3e27","#7a553b","#7b543b","#7b543b","#7b543b","#7a553b","#ba855c","#ba8658","#7a5639","#966c4a"},
        {"#7a553b","#966e4b","#7a553b","#bb845e","#ba855c","#7b5539","#ba855c","#986b4a","#5d3c29","#ba855e","#ba855e","#5a3d29","#966c4a","#966c4a","#8b8a83","#7a553d"},
        {"#966c4a","#7a553b","#7a553b","#966b4c","#966c4a","#b8865c","#7a553d","#966c4a","#6e6b6c","#966c4a","#966c4a","#7a553b","#5b3e2a","#966c4a","#7a553d","#583e29"},
        {"#7a553b","#5a3d29","#966c4a","#7b5539","#946c4a","#966c4a","#b8865e","#7a553b","#7a553b","#7a553b","#7a553b","#7a553b","#7a553b","#7a553b","#ba855e","#ba855e"},
        {"#7a553b","#966b4c","#785639","#7a553b","#755844","#7a553b","#976d4b","#966c4a","#7a553b","#5a3d29","#ba855e","#5a3d29","#7a553b","#ba855c","#966c4a","#966c4a"},
        {"#986b4a","#7a553b","#5a3e27","#ba855c","#7a553b","#5d3e2a","#7a553b","#583e27","#ba855e","#ba855c","#7b563e","#966b4c","#7b5539","#7d563a","#946c4a","#946c4a"},
        {"#966c4a","#79543a","#ba855e","#946c4a","#966c4a","#7b543d","#878787","#7a553d","#986b4a","#966c4a","#795438","#7a553b","#946c4a","#966c4a","#7a553b","#5a3d2b"}
    };

    static final String beetroots[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d"},
        {"#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#55ab2d","#4a8f28","#55ab2d","#2b702a","#xxxxxx","#266325","#2b702a","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#55ab2d"},
        {"#4a8f28","#55ab2d","#xxxxxx","#2b702a","#4a8f28","#55ab2d","#4a8f28","#55ab2d","#266325","#2b702a","#55ab2d","#2b702a","#xxxxxx","#55ab2d","#2b702a","#4a8f28"},
        {"#55ab2d","#55ab2d","#266325","#2b702a","#2b702a","#55ab2d","#4a8f28","#4a8f28","#266325","#55ab2d","#4a8f28","#2b702a","#4a8f28","#4a8f28","#4a8f28","#266325"},
        {"#55ab2d","#4a8f28","#55ab2d","#55ab2d","#266325","#4a8f28","#55ab2d","#2b702a","#4a8f28","#4a8f28","#2b702a","#266325","#2b702a","#4a8f28","#55ab2d","#xxxxxx"},
        {"#xxxxxx","#4a8f28","#2b702a","#4a8f28","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#4a8f28","#2b702a","#xxxxxx","#4a8f28","#2b702a","#55ab2d","#4a8f28","#xxxxxx"},
        {"#xxxxxx","#4a8f28","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#2b702a","#xxxxxx","#xxxxxx","#2b702a","#4a8f28","#4a8f28","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#742303","#2b702a","#266325","#xxxxxx","#xxxxxx","#266325","#266325","#9b221a","#742303","#xxxxxx","#742303","#2b702a","#9b221a","#742303","#xxxxxx"}
    };

    static final String wheat[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#dcbb65","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#cdb159","#dcbb65","#xxxxxx","#xxxxxx","#xxxxxx","#cdb159","#dcbb65","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#dcbb65","#a69553","#xxxxxx","#xxxxxx","#xxxxxx","#dcbb65","#cdb159","#xxxxxx","#xxxxxx","#xxxxxx","#dcbb65","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#a69553","#cdb159","#xxxxxx","#xxxxxx","#xxxxxx","#75772f","#a69553","#75772f","#xxxxxx","#dcbb65","#cdb159","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#a69553","#75772f","#a69553","#xxxxxx","#xxxxxx","#a69553","#cdb159","#cdb159","#a69553","#cdb159","#dcbb65","#xxxxxx","#xxxxxx","#dcbb65","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#a69553","#cdb159","#a69553","#xxxxxx","#xxxxxx","#a69553","#a69553","#cdb159","#xxxxxx","#a69553","#a69553","#dcbb65","#cdb159","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#cdb159","#8a8636","#8a8636","#xxxxxx","#xxxxxx","#cdb159","#xxxxxx","#xxxxxx","#xxxxxx","#8a8636","#75772f","#cdb159","#dcbb65","#75772f"},
        {"#8a8636","#xxxxxx","#a69553","#8a8636","#a69553","#xxxxxx","#dcbb65","#cdb159","#xxxxxx","#8a8636","#xxxxxx","#a69553","#xxxxxx","#a69553","#a69553","#xxxxxx"},
        {"#cdb159","#dcbb65","#a69553","#8a8636","#cdb159","#8a8636","#cdb159","#a69553","#xxxxxx","#8a8636","#xxxxxx","#8a8636","#xxxxxx","#a69553","#cdb159","#xxxxxx"},
        {"#a69553","#cdb159","#cdb159","#xxxxxx","#a69553","#8a8636","#75772f","#a69553","#xxxxxx","#cdb159","#dcbb65","#a69553","#xxxxxx","#xxxxxx","#cdb159","#xxxxxx"},
        {"#8a8636","#8a8636","#a69553","#xxxxxx","#a69553","#75772f","#xxxxxx","#a69553","#xxxxxx","#a69553","#a69553","#cdb159","#xxxxxx","#xxxxxx","#cdb159","#xxxxxx"},
        {"#8a8636","#8a8636","#a69553","#xxxxxx","#8a8636","#xxxxxx","#xxxxxx","#cdb159","#xxxxxx","#8a8636","#8a8636","#cdb159","#xxxxxx","#xxxxxx","#a69553","#xxxxxx"},
        {"#8a8636","#xxxxxx","#cdb159","#xxxxxx","#75772f","#xxxxxx","#8a8636","#cdb159","#xxxxxx","#8a8636","#xxxxxx","#a69553","#75772f","#xxxxxx","#a69553","#cdb159"},
        {"#75772f","#xxxxxx","#dcbb65","#xxxxxx","#5b6b0f","#xxxxxx","#8a8636","#a69553","#cdb159","#xxxxxx","#xxxxxx","#75772f","#a69553","#xxxxxx","#8a8636","#a69553"},
        {"#5b6b0f","#xxxxxx","#cdb159","#a69553","#cdb159","#xxxxxx","#75772f","#5b6b0f","#a69553","#cdb159","#xxxxxx","#cdb159","#75772f","#xxxxxx","#8a8636","#xxxxxx"},
        {"#5b6b0f","#xxxxxx","#a69553","#75772f","#5b6b0f","#xxxxxx","#75772f","#5b6b0f","#xxxxxx","#5b6b0f","#xxxxxx","#a69553","#5b6b0f","#xxxxxx","#5b6b0f","#xxxxxx"},
    };

    static final String carrot[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#266325","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#2b702a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#2b702a","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#266325","#xxxxxx","#2b702a","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#266325","#xxxxxx","#4a8f28","#55ab2d","#4a8f28","#2b702a","#55ab2d","#xxxxxx","#xxxxxx","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#xxxxxx","#2b702a","#4a8f28","#55ab2d","#4a8f28","#55ab2d","#xxxxxx","#2b702a","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#266325","#4a8f28","#2b702a","#4a8f28","#55ab2d","#2b702a","#55ab2d","#266325","#2b702a","#4a8f28","#2b702a","#2b702a","#4a8f28","#2b702a","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#266325","#4a8f28","#2b702a","#4a8f28","#55ab2d","#4a8f28","#266325","#55ab2d","#55ab2d","#266325","#55ab2d","#4a8f28","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#266325","#4a8f28","#2b702a","#4a8f28","#55ab2d","#4a8f28","#2b702a","#4a8f28","#2b702a","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#4a8f28","#266325","#2b702a","#2b702a","#2b702a","#4a8f28","#266325","#266325","#2b702a","#266325","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#266325","#2b702a","#xxxxxx","#266325","#2b702a","#266325","#266325","#xxxxxx","#266325","#2b702a","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#266325","#204626","#xxxxxx","#xxxxxx","#266325","#204626","#xxxxxx","#xxxxxx","#204626","#266325","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#c46f14","#e38a1d","#xxxxxx","#xxxxxx","#c46f14","#e38a1d","#xxxxxx","#ab6112","#e38a1d","#c46f14","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#ab6112","#e38a1d","#e38a1d","#ab6112","#7e3d0e","#e38a1d","#e38a1d","#ab6112","#c46f14","#e38a1d","#e38a1d","#ab6112","#xxxxxx","#xxxxxx"}
    };

    static final String potato[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#xxxxxx","#xxxxxx","#2b702a","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#4a8f28","#4a8f28","#2b702a","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#55ab2d","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#2b702a","#266325","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#2b702a","#4a8f28","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#55ab2d","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#55ab2d","#xxxxxx","#2b702a","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#4a8f28","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#2b702a","#55ab2d","#xxxxxx","#xxxxxx","#4a8f28","#266325","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#4a8f28","#xxxxxx","#xxxxxx","#55ab2d","#4a8f28","#2b702a","#xxxxxx","#xxxxxx","#55ab2d","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#2b702a","#xxxxxx","#xxxxxx","#4a8f28","#2b702a","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#4a8f28","#xxxxxx","#2b702a","#4a8f28","#2b702a","#266325","#4a8f28","#xxxxxx","#2b702a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#907540","#907540","#266325","#2b702a","#907540","#907540","#266325","#2b702a","#907540","#907540","#2b702a","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#907540","#aa8d4a","#aa8d4a","#856b3a","#907540","#c8a24b","#c8a24b","#856b3a","#907540","#c8a24b","#aa8d4a","#856b3a","#xxxxxx","#xxxxxx"},
    };

    static final String oakLog[][] = {
        {"#735a35","#4c3d25","#937045","#735a35","#735a35","#372b17","#937044","#735a35","#735a35","#392a17","#735936","#927143","#4c3d25","#917143","#725a36","#5e4b2b"},
        {"#735a35","#4c3d25","#99784a","#604a29","#735a35","#372b18","#99784a","#604a2a","#735a35","#372a18","#735a35","#927143","#4c3d25","#745a34","#735a35","#5e4b2b"},
        {"#735a34","#372a1a","#5f4a2a","#5e4b2b","#735a35","#372a19","#9a7849","#5f4a2a","#735a35","#4b3e25","#735a35","#4c3d26","#4c3d25","#735a35","#735a34","#5e4b2b"},
        {"#927143","#372a18","#755936","#5e4b2b","#735a35","#4a3e24","#755935","#5f4a2a","#735a35","#5d4b2a","#755935","#372a18","#4c3d25","#735a34","#927045","#5e4b2b"},
        {"#927143","#4c3d27","#735936","#5e4b2b","#735935","#372a18","#735a35","#5e4b2b","#99784a","#604a2a","#745935","#5e4b2b","#735a35","#4c3d25","#937043","#735a35"},
        {"#927143","#735a35","#4c3d26","#735935","#927143","#4d3d22","#735a34","#4c3d26","#99784a","#5e4b2b","#907145","#4b3e25","#735a35","#4b3e25","#927142","#735a35"},
        {"#5e4b2b","#735936","#4c3e23","#735a35","#927143","#5f4b2a","#604a29","#725a35","#917143","#735a35","#947045","#725a34","#735a35","#4d3d25","#927143","#735a35"},
        {"#5f4a2a","#735936","#372b18","#745935","#917143","#725a35","#5d4b2b","#917243","#745935","#745936","#927045","#5e4b2b","#755935","#5f4a2b","#917143","#735a35"},
        {"#735a35","#4b3e25","#392a19","#99784a","#745935","#735a35","#5e4b2b","#917243","#755935","#604a2b","#927144","#5e4b2b","#917143","#5e4b2b","#917143","#735a35"},
        {"#735a35","#735a36","#4a3e26","#99784a","#735a35","#735a35","#5e4b2b","#735a35","#735a35","#604a2b","#937140","#4c3d26","#927143","#735a34","#362b18","#735a35"},
        {"#735a35","#725a36","#725a35","#927143","#735a35","#604a2b","#735936","#382a18","#725a33","#5f4a2c","#735a34","#4c3d26","#927143","#725a36","#372a18","#735a35"},
        {"#735a35","#4c3d25","#725a35","#927143","#735a35","#5e4b2a","#725a36","#372a18","#99784a","#735a35","#735936","#372b16","#99784a","#735935","#4c3d25","#735a35"},
        {"#99784a","#4c3d25","#735a34","#735a35","#927143","#5e4b29","#927143","#372a18","#99784b","#5e4b2b","#735a35","#372a18","#735a35","#735a35","#5f4a2a","#735a35"},
        {"#99784a","#735936","#4c3e23","#735a35","#927143","#735a33","#745935","#4c3d25","#927143","#5d4b2c","#745935","#4c3d25","#735a35","#735a34","#735a33","#735a35"},
        {"#927143","#735a35","#4b3e25","#927143","#735a35","#755933","#927143","#372a18","#735a35","#4b3e24","#745936","#4d3d25","#4c3e23","#927143","#755836","#735a33"},
        {"#927143","#755935","#4c3d25","#927143","#4c3d25","#735a35","#927143","#4c3d25","#735a35","#4a3e25","#735a35","#735a35","#4c3d25","#917143","#735a34","#5e4b2b"},
    };

    static final String oakPlank[][] = {
        {"#b8945f","#af8f55","#b8945f","#c29d62","#c29d62","#c29d62","#c29d62","#c29d62","#b8945f","#c29d62","#c29d62","#c29d62","#c29d62","#c29d62","#b8945f","#967441"},
        {"#b8945f","#b8945f","#af8f55","#af8f55","#967441","#9f844d","#af8f55","#b8945f","#b8945f","#b8945f","#af8f55","#af8f55","#b8945f","#b8945f","#9f844d","#9f844d"},
        {"#af8f55","#b8945f","#b8945f","#b8945f","#af8f55","#b8945f","#af8f55","#9f844d","#9f844d","#9f844d","#9f844d","#af8f55","#af8f55","#b8945f","#b8945f","#967441"},
        {"#967441","#7e6237","#7e6237","#967441","#967441","#7e6237","#67502c","#67502c","#7e6237","#7e6237","#67502c","#7e6237","#67502c","#67502c","#7e6237","#67502c"},
        {"#b8945f","#c29d62","#9f844d","#c29d62","#c29d62","#c29d62","#c29d62","#9f844d","#c29d62","#c29d62","#c29d62","#b8945f","#af8f55","#af8f55","#9f844d","#b8945f"},
        {"#af8f55","#b8945f","#b8945f","#af8f55","#9f844d","#af8f55","#9f844d","#967441","#9f844d","#af8f55","#af8f55","#b8945f","#b8945f","#b8945f","#b8945f","#af8f55"},
        {"#9f844d","#9f844d","#af8f55","#b8945f","#af8f55","#af8f55","#af8f55","#967441","#b8945f","#b8945f","#b8945f","#af8f55","#af8f55","#9f844d","#9f844d","#9f844d"},
        {"#67502c","#67502c","#7e6237","#7e6237","#967441","#7e6237","#67502c","#67502c","#67502c","#67502c","#7e6237","#7e6237","#7e6237","#967441","#7e6237","#67502c"},
        {"#b8945f","#c29d62","#c29d62","#b8945f","#af8f55","#af8f55","#c29d62","#c29d62","#c29d62","#c29d62","#c29d62","#c29d62","#c29d62","#c29d62","#b8945f","#9f844d"},
        {"#b8945f","#af8f55","#b8945f","#b8945f","#b8945f","#b8945f","#af8f55","#9f844d","#9f844d","#9f844d","#af8f55","#9f844d","#af8f55","#9f844d","#9f844d","#967441"},
        {"#c29d62","#b8945f","#af8f55","#af8f55","#9f844d","#9f844d","#9f844d","#9f844d","#af8f55","#af8f55","#af8f55","#af8f55","#9f844d","#9f844d","#b8945f","#9f844d"},
        {"#67502c","#67502c","#7e6237","#967441","#967441","#7e6237","#67502c","#67502c","#67502c","#7e6237","#967441","#7e6237","#7e6237","#67502c","#67502c","#67502c"},
        {"#c29d62","#9f844d","#b8945f","#c29d62","#c29d62","#b8945f","#b8945f","#9f844d","#c29d62","#c29d62","#c29d62","#9f844d","#c29d62","#b8945f","#c29d62","#c29d62"},
        {"#af8f55","#af8f55","#b8945f","#b8945f","#9f844d","#9f844d","#af8f55","#9f844d","#9f844d","#b8945f","#b8945f","#af8f55","#b8945f","#af8f55","#af8f55","#af8f55"},
        {"#af8f55","#9f844d","#9f844d","#af8f55","#b8945f","#af8f55","#9f844d","#967441","#b8945f","#b8945f","#af8f55","#9f844d","#9f844d","#9f844d","#9f844d","#9f844d"},
        {"#67502c","#7e6237","#7e6237","#67502c","#67502c","#7e6237","#967441","#967441","#967441","#7e6237","#67502c","#7e6237","#67502c","#67502c","#67502c","#67502c"}
    };

    static final String stoneBrick[][] = {
        {"#9f9f9f","#989898","#a0a0a0","#a0a0a0","#909090","#9c9c9c","#979797","#979797","#949494","#949494","#949494","#9a9a9a","#8d8d8d","#8a8a8a","#8a8a8a","#5c5c5c"},
        {"#9c9c9c","#888888","#888888","#888888","#797979","#888888","#888888","#888888","#737373","#7f7f7f","#7f7f7f","#797979","#7f7f7f","#7f7f7f","#7b7b7b","#5f5f5f"},
        {"#909090","#797979","#797979","#797979","#888888","#797979","#7f7f7f","#7f7f7f","#7f7f7f","#888888","#7f7f7f","#7f7f7f","#7f7f7f","#737373","#6e6e6e","#5d5d5d"},
        {"#979797","#737373","#7f7f7f","#888888","#7f7f7f","#7f7f7f","#797979","#797979","#797979","#797979","#797979","#7f7f7f","#7f7f7f","#888888","#6e6e6e","#606060"},
        {"#949494","#797979","#797979","#797979","#797979","#797979","#888888","#888888","#888888","#888888","#888888","#737373","#7f7f7f","#888888","#747474","#5d5d5d"},
        {"#939393","#797979","#797979","#797979","#7f7f7f","#737373","#7f7f7f","#7f7f7f","#797979","#797979","#737373","#7f7f7f","#797979","#797979","#6a6a6a","#616161"},
        {"#8d8d8d","#727272","#787878","#747474","#6e6e6e","#6e6e6e","#6e6e6e","#6e6e6e","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5d5d5d","#5d5d5d"},
        {"#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5d5d5d","#5d5d5d"},
        {"#949494","#979797","#979797","#979797","#9c9c9c","#9c9c9c","#969696","#5b5b5b","#929292","#8e8e8e","#8e8e8e","#848484","#909090","#969696","#8d8d8d","#9b9b9b"},
        {"#797979","#797979","#7f7f7f","#737373","#7f7f7f","#7f7f7f","#6f6f6f","#5b5b5b","#868686","#7b7b7b","#747474","#767676","#737373","#747474","#767676","#787878"},
        {"#888888","#888888","#797979","#737373","#797979","#888888","#767676","#5b5b5b","#8a8a8a","#747474","#747474","#777777","#787878","#848484","#767676","#787878"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#888888","#888888","#7f7f7f","#6e6e6e","#5b5b5b","#929292","#7f7f7f","#6b6b6b","#6c6c6c","#787878","#7a7a7a","#7c7c7c","#787878"},
        {"#797979","#797979","#797979","#888888","#888888","#797979","#696969","#5b5b5b","#8c8c8c","#737373","#787878","#787878","#737373","#757575","#777777","#787878"},
        {"#7f7f7f","#7f7f7f","#797979","#797979","#797979","#737373","#696969","#5b5b5b","#8e8e8e","#838383","#838383","#7a7a7a","#838383","#757575","#868686","#727272"},
        {"#696969","#696969","#696969","#6e6e6e","#6a6a6a","#747474","#787878","#5b5b5b","#878787","#6a6a6a","#757575","#707070","#6b6b6b","#6c6c6c","#676767","#696969"},
        {"#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b"}
    };

    static final String stoneStairLeft[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#949494","#949494","#949494","#9a9a9a","#8d8d8d","#8a8a8a","#8a8a8a","#5c5c5c"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#737373","#7f7f7f","#7f7f7f","#797979","#7f7f7f","#7f7f7f","#7b7b7b","#5f5f5f"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#7f7f7f","#888888","#7f7f7f","#7f7f7f","#7f7f7f","#737373","#6e6e6e","#5d5d5d"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#797979","#797979","#797979","#7f7f7f","#7f7f7f","#888888","#6e6e6e","#606060"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#888888","#888888","#888888","#737373","#7f7f7f","#888888","#747474","#5d5d5d"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#797979","#797979","#737373","#7f7f7f","#797979","#797979","#6a6a6a","#616161"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#747474","#747474","#707070","#656565","#6c6c6c","#747474","#727272","#626262"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5d5d5d","#5d5d5d"},
        {"#949494","#979797","#979797","#979797","#9c9c9c","#9c9c9c","#969696","#5b5b5b","#929292","#8e8e8e","#8e8e8e","#848484","#909090","#969696","#8d8d8d","#9b9b9b"},
        {"#797979","#797979","#7f7f7f","#737373","#7f7f7f","#7f7f7f","#6f6f6f","#5b5b5b","#868686","#7b7b7b","#747474","#767676","#737373","#747474","#767676","#787878"},
        {"#888888","#888888","#797979","#737373","#797979","#888888","#767676","#5b5b5b","#8a8a8a","#747474","#747474","#777777","#787878","#848484","#767676","#787878"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#888888","#888888","#7f7f7f","#6e6e6e","#5b5b5b","#929292","#7f7f7f","#6b6b6b","#6c6c6c","#787878","#7a7a7a","#7c7c7c","#787878"},
        {"#797979","#797979","#797979","#888888","#888888","#797979","#696969","#5b5b5b","#8c8c8c","#737373","#787878","#787878","#737373","#757575","#777777","#787878"},
        {"#7f7f7f","#7f7f7f","#797979","#797979","#797979","#737373","#696969","#5b5b5b","#8e8e8e","#838383","#838383","#7a7a7a","#838383","#757575","#868686","#727272"},
        {"#696969","#696969","#696969","#6e6e6e","#6a6a6a","#747474","#787878","#5b5b5b","#878787","#6a6a6a","#757575","#707070","#6b6b6b","#6c6c6c","#676767","#696969"},
        {"#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b"}
    };

    static final String stoneStairRight[][] = {
        {"#9f9f9f","#989898","#a0a0a0","#a0a0a0","#909090","#9c9c9c","#979797","#979797","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#9c9c9c","#888888","#888888","#888888","#797979","#888888","#888888","#888888","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#909090","#797979","#797979","#797979","#888888","#797979","#7f7f7f","#7f7f7f","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#979797","#737373","#7f7f7f","#888888","#7f7f7f","#7f7f7f","#797979","#797979","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#949494","#797979","#797979","#797979","#797979","#797979","#888888","#888888","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#939393","#797979","#797979","#797979","#7f7f7f","#737373","#7f7f7f","#7f7f7f","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#8d8d8d","#727272","#787878","#747474","#6e6e6e","#6e6e6e","#6e6e6e","#6e6e6e","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#949494","#979797","#979797","#979797","#9c9c9c","#9c9c9c","#969696","#5b5b5b","#929292","#8e8e8e","#8e8e8e","#848484","#909090","#969696","#8d8d8d","#9b9b9b"},
        {"#797979","#797979","#7f7f7f","#737373","#7f7f7f","#7f7f7f","#6f6f6f","#5b5b5b","#868686","#7b7b7b","#747474","#767676","#737373","#747474","#767676","#787878"},
        {"#888888","#888888","#797979","#737373","#797979","#888888","#767676","#5b5b5b","#8a8a8a","#747474","#747474","#777777","#787878","#848484","#767676","#787878"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#888888","#888888","#7f7f7f","#6e6e6e","#5b5b5b","#929292","#7f7f7f","#6b6b6b","#6c6c6c","#787878","#7a7a7a","#7c7c7c","#787878"},
        {"#797979","#797979","#797979","#888888","#888888","#797979","#696969","#5b5b5b","#8c8c8c","#737373","#787878","#787878","#737373","#757575","#777777","#787878"},
        {"#7f7f7f","#7f7f7f","#797979","#797979","#797979","#737373","#696969","#5b5b5b","#8e8e8e","#838383","#838383","#7a7a7a","#838383","#757575","#868686","#727272"},
        {"#696969","#696969","#696969","#6e6e6e","#6a6a6a","#747474","#787878","#5b5b5b","#878787","#6a6a6a","#757575","#707070","#6b6b6b","#6c6c6c","#676767","#696969"},
        {"#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b","#5b5b5b"}
    };

    static final String oakLogLeaf[][] = {
        {"#435924","#4c3d25","#937045","#35461e","#425824","#372b17","#37491f","#735a35","#37481f","#35461e","#425824","#927143","#37491f","#917143","#35461e","#35461e"},
        {"#735a35","#37481f","#486328","#415723","#35461e","#37481f","#99784a","#37491f","#735a35","#435924","#486428","#927143","#4c3d25","#745a34","#496529","#35461e"},
        {"#735a34","#372a1a","#425824","#35461e","#36471e","#372a19","#435924","#36471e","#735a35","#4b3e25","#735a35","#36471e","#37481f","#735a35","#735a34","#37481f"},
        {"#425824","#486428","#755936","#5e4b2b","#435924","#4a3e24","#486428","#435924","#735a35","#5d4b2a","#35461e","#54772f","#425824","#37481f","#927045","#5e4b2b"},
        {"#425824","#35461e","#425824","#557830","#425824","#37481f","#735a35","#5e4b2b","#37481f","#604a2a","#425824","#486328","#735a35","#4c3d25","#37481f","#735a35"},
        {"#927143","#37481f","#4c3d26","#425824","#36471e","#4d3d22","#735a34","#37481f","#35461e","#486328","#435924","#4b3e25","#735a35","#37491f","#35461e","#54772f"},
        {"#5e4b2b","#735936","#37481f","#735a35","#927143","#557830","#486328","#725a35","#435924","#425824","#947045","#37481f","#735a35","#4d3d25","#435924","#415723"},
        {"#5f4a2a","#37491f","#35461e","#486428","#917143","#486328","#415723","#435924","#745935","#745936","#486328","#415723","#37481f","#5f4a2b","#917143","#735a35"},
        {"#735a35","#4b3e25","#486428","#486428","#745935","#735a35","#37481f","#917243","#37481f","#604a2b","#557830","#476227","#917143","#5e4b2b","#917143","#435924"},
        {"#486328","#37481f","#4a3e26","#99784a","#37481f","#735a35","#5e4b2b","#486428","#35461e","#37481f","#937140","#476227","#557830","#735a34","#567931","#415723"},
        {"#557830","#725a36","#725a35","#37481f","#35461e","#486428","#735936","#557830","#557830","#5f4a2c","#735a34","#557830","#415723","#425824","#425824","#735a35"},
        {"#735a35","#4c3d25","#435924","#927143","#486328","#557830","#725a36","#372a18","#99784a","#557830","#557830","#372b16","#435924","#735935","#425824","#735a35"},
        {"#99784a","#557830","#415723","#435924","#927143","#5e4b29","#927143","#445a25","#99784b","#486328","#415723","#435924","#735a35","#435924","#415723","#476227"},
        {"#99784a","#486328","#557830","#735a35","#37481f","#735a33","#445a25","#415723","#486328","#5d4b2c","#435924","#4c3d25","#735a35","#735a34","#486428","#54772f"},
        {"#927143","#435924","#4b3e25","#54772f","#476227","#425824","#927143","#486428","#557830","#4b3e24","#745936","#486328","#486428","#927143","#755836","#735a33"},
        {"#557830","#755935","#4c3d25","#486328","#405623","#486328","#927143","#4c3d25","#735a35","#445a25","#735a35","#54772f","#405623","#435924","#735a34","#567931"}
    };

    static final String oakleaf[][] = {
        {"#435924","#000000","#000000","#35461e","#425824","#000000","#37491f","#000000","#37481f","#35461e","#425824","#000000","#37491f","#000000","#35461e","#35461e"},
        {"#000000","#37481f","#486328","#415723","#35461e","#37481f","#000000","#37491f","#000000","#435924","#486428","#000000","#000000","#000000","#496529","#35461e"},
        {"#000000","#000000","#425824","#35461e","#36471e","#000000","#435924","#36471e","#000000","#000000","#000000","#36471e","#37481f","#000000","#000000","#37481f"},
        {"#425824","#486428","#000000","#000000","#435924","#000000","#486428","#435924","#000000","#000000","#35461e","#54772f","#425824","#37481f","#000000","#000000"},
        {"#425824","#35461e","#425824","#557830","#425824","#37481f","#000000","#000000","#37481f","#000000","#425824","#486328","#000000","#000000","#37481f","#000000"},
        {"#000000","#37481f","#000000","#425824","#36471e","#000000","#000000","#37481f","#35461e","#486328","#435924","#000000","#000000","#37491f","#35461e","#54772f"},
        {"#000000","#000000","#37481f","#000000","#000000","#557830","#486328","#000000","#435924","#425824","#000000","#37481f","#000000","#000000","#435924","#415723"},
        {"#000000","#37491f","#35461e","#486428","#000000","#486328","#415723","#435924","#000000","#000000","#486328","#415723","#37481f","#000000","#000000","#000000"},
        {"#000000","#000000","#486428","#486428","#000000","#000000","#37481f","#000000","#37481f","#000000","#557830","#476227","#000000","#000000","#000000","#435924"},
        {"#486328","#37481f","#000000","#000000","#37481f","#000000","#000000","#486428","#35461e","#37481f","#000000","#476227","#557830","#000000","#567931","#415723"},
        {"#557830","#000000","#000000","#37481f","#35461e","#486428","#000000","#557830","#557830","#000000","#000000","#557830","#415723","#425824","#425824","#000000"},
        {"#000000","#000000","#435924","#000000","#486328","#557830","#000000","#000000","#000000","#557830","#557830","#000000","#435924","#000000","#425824","#000000"},
        {"#000000","#557830","#415723","#435924","#000000","#000000","#000000","#445a25","#000000","#486328","#415723","#435924","#000000","#435924","#415723","#476227"},
        {"#000000","#486328","#557830","#000000","#37481f","#000000","#445a25","#415723","#486328","#000000","#435924","#000000","#000000","#000000","#486428","#54772f"},
        {"#000000","#435924","#000000","#54772f","#476227","#425824","#000000","#486428","#557830","#000000","#000000","#486328","#486428","#000000","#000000","#000000"},
        {"#557830","#000000","#000000","#486328","#405623","#486328","#000000","#000000","#000000","#445a25","#000000","#54772f","#405623","#435924","#000000","#567931"}
    };

    static final String grassPlant[][] = {
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#aed581","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#689f38","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#xxxxxx","#aed581","#xxxxxx","#xxxxxx","#689f38","#xxxxxx","#xxxxxx","#aed581","#xxxxxx","#689f38","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#558b2f"},
        {"#xxxxxx","#xxxxxx","#689f38","#558b2f","#xxxxxx","#689f38","#xxxxxx","#xxxxxx","#689f38","#xxxxxx","#558b2f","#xxxxxx","#689f38","#xxxxxx","#aed581","#558b2f"},
        {"#aed581","#xxxxxx","#689f38","#689f38","#xxxxxx","#689f38","#558b2f","#xxxxxx","#689f38","#xxxxxx","#558b2f","#689f38","#aed581","#xxxxxx","#689f38","#689f38"},
        {"#8bc34a","#558b2f","#xxxxxx","#689f38","#xxxxxx","#689f38","#558b2f","#xxxxxx","#689f38","#558b2f","#689f38","#689f38","#aed581","#xxxxxx","#689f38","#xxxxxx"},
        {"#aed581","#558b2f","#xxxxxx","#689f38","#xxxxxx","#689f38","#558b2f","#xxxxxx","#558b2f","#689f38","#558b2f","#xxxxxx","#aed581","#xxxxxx","#689f38","#xxxxxx"},
        {"#689f38","#689f38","#558b2f","#689f38","#558b2f","#689f38","#689f38","#689f38","#558b2f","#689f38","#558b2f","#xxxxxx","#689f38","#xxxxxx","#558b2f","#xxxxxx"},
        {"#xxxxxx","#689f38","#558b2f","#689f38","#558b2f","#689f38","#689f38","#xxxxxx","#689f38","#689f38","#689f38","#689f38","#689f38","#689f38","#689f38","#xxxxxx"},
        {"#xxxxxx","#689f38","#558b2f","#xxxxxx","#558b2f","#558b2f","#689f38","#689f38","#558b2f","#xxxxxx","#558b2f","#558b2f","#689f38","#558b2f","#689f38","#xxxxxx"},
        {"#xxxxxx","#689f38","#558b2f","#xxxxxx","#558b2f","#xxxxxx","#558b2f","#689f38","#558b2f","#xxxxxx","#558b2f","#689f38","#689f38","#558b2f","#689f38","#xxxxxx"},
        {"#xxxxxx","#558b2f","#689f38","#xxxxxx","#558b2f","#xxxxxx","#558b2f","#689f38","#558b2f","#xxxxxx","#558b2f","#689f38","#689f38","#558b2f","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#558b2f","#558b2f","#8bc34a","#558b2f","#7cb342","#558b2f","#689f38","#558b2f","#689f38","#558b2f","#689f38","#558b2f","#689f38","#xxxxxx","#xxxxxx"},
        {"#xxxxxx","#7cb342","#8bc34a","#8bc34a","#558b2f","#7cb342","#558b2f","#689f38","#689f38","#689f38","#558b2f","#689f38","#558b2f","#689f38","#7cb342","#xxxxxx"},
        {"#xxxxxx","#6a9938","#6a9938","#689f38","#8bc34a","#689f38","#558b2f","#8bc34a","#558b2f","#8bc34a","#558b2f","#558b2f","#558b2f","#558b2f","#689f38","#xxxxxx"},
        {"#7cb342","#8bc34a","#689f38","#558b2f","#689f38","#558b2f","#558b2f","#689f38","#558b2f","#689f38","#689f38","#689f38","#558b2f","#689f38","#558b2f","#xxxxxx"}
    };

    static final String beeNest[][] = {
        {"#f7ce46","#f7ce46","#f7ce46","#fbdc75","#fbdc75","#fbdc75","#fbdc75","#fbdc75","#fbdc75","#fbdc75","#fbdc75","#fbdc75","#c88644","#c88644","#fbdc75","#fbdc75"},
        {"#f7ce46","#f7ce46","#f7ce46","#f7ce46","#fbdc75","#fbdc75","#fbdc75","#fbdc75","#f7ce46","#f7ce46","#fbdc75","#c88644","#fbdc75","#fbdc75","#c88644","#fbdc75"},
        {"#d9a453","#d9a453","#d9a453","#d9a453","#d9a453","#f7ce46","#f7ce46","#f7ce46","#d9a453","#d9a453","#c88644","#d9a453","#d9a453","#d9a453","#d9a453","#c88644"},
        {"#6f533a","#6f533a","#624831","#624831","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#624831","#704c2e","#704c2e","#896445","#624831"},
        {"#fbdc75","#f7ce46","#fbdc75","#fbdc75","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#fbdc75","#704c2e","#ea8e16","#eaa616","#eaa616","#896445","#fbdc75"},
        {"#d9a453","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#d9a453","#d9a453","#a28166","#eaa616","#fabf29","#fabf29","#a28166","#d9a453"},
        {"#c88644","#c88644","#c88644","#c88644","#d9a453","#d9a453","#c88644","#c88644","#c88644","#c88644","#a28166","#fabf29","#fade29","#fade29","#c88644","#c88644"},
        {"#6f533a","#624831","#6f533a","#6f533a","#624831","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#896445","#fade29","#fade29","#fabf29","#c8a671","#6f533a"},
        {"#d9a453","#d9a453","#d9a453","#d9a453","#d9a453","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#d9a453","#c8a671","#fff9cf","#c8a671","#c88644","#d9a453"},
        {"#d9a453","#c88644","#c88644","#c88644","#d9a453","#d9a453","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#f7ce46","#fabf29","#f7ce46","#d9a453","#d9a453"},
        {"#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644","#c88644"},
        {"#624831","#6f533a","#624831","#704c2e","#704c2e","#7c512b","#624831","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a"},
        {"#c8a671","#704c2e","#ea8e16","#ea8e16","#eaa616","#896445","#c88644","#c88644","#c88644","#c8a671","#c88644","#c8a671","#c88644","#c88644","#c88644","#c88644"},
        {"#c8a671","#a28166","#eaa616","#fabf29","#fade29","#a28166","#c8a671","#c8a671","#c8a671","#c8a671","#c8a671","#c8a671","#c8a671","#c8a671","#c8a671","#c8a671"},
        {"#bc986d","#a28166","#fabf29","#fade29","#fff9cf","#c88644","#a28166","#a28166","#a28166","#a28166","#a28166","#a28166","#bc986d","#bc986d","#a28166","#a28166"},
        {"#6f533a","#896445","#c8a671","#fade29","#fade29","#c8a671","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a","#6f533a"}
    };

    static final String oakDoorTop[][] = {
        {"#b7945e","#a7824d","#a9814d","#b7945e","#b7945e","#b7945e","#b7945e","#a7824d","#b7945e","#b7945e","#b7945e","#b7945e","#a7824d","#b7945e","#b7945e","#96733f"},
        {"#a7824d","#96733f","#95743f","#96743d","#96733f","#96743d","#96733f","#96733f","#96733f","#96733f","#96733f","#95743f","#96733f","#96743d","#96733f","#67502c"},
        {"#b7945e","#96743d","#553b26","#66502c","#67502c","#66502c","#6b4e2e","#96743d","#523c26","#67502a","#67502a","#67502a","#67502a","#95743f","#96733f","#67502c"},
        {"#b7945e","#96733f","#67502c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a7824d","#67502c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a5834b","#96733f","#523d24"},
        {"#7f8b94","#96733f","#67502c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#b38d4f","#67502c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#b38d4f","#957441","#7d6237"},
        {"#6f6f6f","#95743f","#674f2e","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a7824d","#67502c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a5834d","#95753d","#67502c"},
        {"#a7824d","#96733f","#7d6237","#a7824d","#b68c4f","#b58d4f","#a7834b","#a7834b","#7f6139","#a7824f","#b58d4f","#b68c4f","#a7824f","#a7824d","#95743f","#67502c"},
        {"#b7945e","#96743d","#503d24","#67502c","#67502c","#67502c","#67502a","#96733f","#533c24","#67502c","#67502c","#67502c","#67502c","#96733f","#96733f","#533c24"},
        {"#b7945e","#96733f","#694f2c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a7824d","#67502c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a7824d","#98733d","#7c6337"},
        {"#a7824d","#96733f","#694f2c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#b58d4d","#67502c","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#b58d4d","#96743d","#67502c"},
        {"#b7945e","#96743d","#694f2a","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a7824d","#674f2e","#xxxxxx","#xxxxxx","#xxxxxx","#xxxxxx","#a7824d","#967341","#694f2c"},
        {"#b7945e","#96733f","#7d6239","#a7824d","#b58d4f","#b58d4f","#a7824d","#a7824d","#7d6237","#a7824d","#b58d4f","#b58d4f","#a7824d","#a7824d","#967341","#523d24"},
        {"#b7945e","#96733f","#a7824d","#a7824d","#a7824d","#96733f","#7d6237","#7d6237","#a7824d","#a7824d","#a7824d","#96733f","#7f6137","#7d6237","#96733f","#7d6237"},
        {"#b7945e","#98733f","#533c24","#67502c","#67502c","#67502c","#67502c","#96733f","#533c24","#66512a","#67502c","#67502c","#67502c","#967341","#98733b","#67502c"},
        {"#a7824d","#96733f","#674f2e","#96733f","#96733f","#96733f","#967341","#a7824d","#67502c","#96733f","#96733f","#818b95","#808c95","#6b6e7b","#98733f","#67502c"},
        {"#808c95","#7d6335","#66502c","#7d6237","#7d6237","#7d6237","#7d6237","#a7824d","#67502c","#7c6337","#7d6237","#6a6f79","#523c26","#7d6239","#7d6237","#523d24"}
    };

    static final String oakDoorTopPlank[][] = {
        {"#b7945e","#a7824d","#a9814d","#b7945e","#b7945e","#b7945e","#b7945e","#a7824d","#b7945e","#b7945e","#b7945e","#b7945e","#a7824d","#b7945e","#b7945e","#96733f"},
        {"#a7824d","#96733f","#95743f","#96743d","#96733f","#96743d","#96733f","#96733f","#96733f","#96733f","#96733f","#95743f","#96733f","#96743d","#96733f","#67502c"},
        {"#b7945e","#96743d","#553b26","#66502c","#67502c","#66502c","#6b4e2e","#96743d","#523c26","#67502a","#67502a","#67502a","#67502a","#95743f","#96733f","#67502c"},
        {"#b7945e","#96733f","#67502c","#967441","#967441","#7e6237","#67502c","#a7824d","#67502c","#7e6237","#67502c","#7e6237","#67502c","#a5834b","#96733f","#523d24"},
        {"#7f8b94","#96733f","#67502c","#c29d62","#c29d62","#c29d62","#c29d62","#b38d4f","#67502c","#c29d62","#c29d62","#b8945f","#af8f55","#b38d4f","#957441","#7d6237"},
        {"#6f6f6f","#95743f","#674f2e","#af8f55","#9f844d","#af8f55","#9f844d","#a7824d","#67502c","#af8f55","#af8f55","#b8945f","#b8945f","#a5834d","#95753d","#67502c"},
        {"#a7824d","#96733f","#7d6237","#a7824d","#b68c4f","#b58d4f","#a7834b","#a7834b","#7f6139","#a7824f","#b58d4f","#b68c4f","#a7824f","#a7824d","#95743f","#67502c"},
        {"#b7945e","#96743d","#503d24","#67502c","#67502c","#67502c","#67502a","#96733f","#533c24","#67502c","#67502c","#67502c","#67502c","#96733f","#96733f","#533c24"},
        {"#b7945e","#96733f","#694f2c","#b8945f","#af8f55","#af8f55","#c29d62","#a7824d","#67502c","#c29d62","#c29d62","#c29d62","#c29d62","#a7824d","#98733d","#7c6337"},
        {"#a7824d","#96733f","#694f2c","#b8945f","#b8945f","#b8945f","#af8f55","#b58d4d","#67502c","#9f844d","#af8f55","#9f844d","#af8f55","#b58d4d","#96743d","#67502c"},
        {"#b7945e","#96743d","#694f2a","#af8f55","#9f844d","#9f844d","#9f844d","#a7824d","#674f2e","#af8f55","#af8f55","#af8f55","#9f844d","#a7824d","#967341","#694f2c"},
        {"#b7945e","#96733f","#7d6239","#a7824d","#b58d4f","#b58d4f","#a7824d","#a7824d","#7d6237","#a7824d","#b58d4f","#b58d4f","#a7824d","#a7824d","#967341","#523d24"},
        {"#b7945e","#96733f","#a7824d","#a7824d","#a7824d","#96733f","#7d6237","#7d6237","#a7824d","#a7824d","#a7824d","#96733f","#7f6137","#7d6237","#96733f","#7d6237"},
        {"#b7945e","#98733f","#533c24","#67502c","#67502c","#67502c","#67502c","#96733f","#533c24","#66512a","#67502c","#67502c","#67502c","#967341","#98733b","#67502c"},
        {"#a7824d","#96733f","#674f2e","#96733f","#96733f","#96733f","#967341","#a7824d","#67502c","#96733f","#96733f","#818b95","#808c95","#6b6e7b","#98733f","#67502c"},
        {"#808c95","#7d6335","#66502c","#7d6237","#7d6237","#7d6237","#7d6237","#a7824d","#67502c","#7c6337","#7d6237","#6a6f79","#523c26","#7d6239","#7d6237","#523d24"},
    };

    static final String oakDoorBottom[][] = {
        {"#6b6f7a","#967441","#67502c","#967441","#967441","#7e6237","#7e6237","#b58d50","#67502c","#967441","#967441","#513d24","#513d24","#b58d50","#967441","#7e6237"},
        {"#a6824d","#967441","#7e6237","#a6824d","#b58d50","#b58d50","#b58d50","#a6824d","#7e6237","#a6824d","#b58d50","#b58d50","#b58d50","#a6824d","#967441","#67502c"},
        {"#a6824d","#967441","#a6824d","#a6824d","#967441","#967441","#7e6237","#7e6237","#967441","#967441","#967441","#7e6237","#7e6237","#967441","#967441","#67502c"},
        {"#b8945f","#967441","#513d24","#67502c","#67502c","#67502c","#67502c","#967441","#513d24","#67502c","#67502c","#67502c","#67502c","#a6824d","#967441","#513d24"},
        {"#b8945f","#967441","#67502c","#967441","#967441","#967441","#967441","#a6824d","#67502c","#967441","#967441","#967441","#967441","#a6824d","#967441","#7e6237"},
        {"#b8945f","#967441","#67502c","#967441","#967441","#967441","#7e6237","#b58d50","#67502c","#967441","#967441","#967441","#7e6237","#b58d50","#967441","#67502c"},
        {"#b8945f","#967441","#67502c","#967441","#967441","#7e6237","#7e6237","#b58d50","#67502c","#967441","#967441","#7e6237","#7e6237","#b58d50","#967441","#67502c"},
        {"#b8945f","#967441","#7e6237","#a6824d","#b58d50","#b58d50","#b58d50","#a6824d","#7e6237","#a6824d","#b58d50","#b58d50","#b58d50","#a6824d","#7e6237","#513d24"},
        {"#a6824d","#967441","#a6824d","#a6824d","#a6824d","#967441","#7e6237","#7e6237","#967441","#a6824d","#a6824d","#967441","#7e6237","#7e6237","#7e6237","#7e6237"},
        {"#b8945f","#967441","#513d24","#67502c","#67502c","#67502c","#67502c","#967441","#7e6237","#67502c","#67502c","#67502c","#67502c","#a6824d","#967441","#67502c"},
        {"#808b95","#967441","#67502c","#967441","#967441","#967441","#967441","#a6824d","#67502c","#967441","#967441","#967441","#967441","#a6824d","#967441","#67502c"},
        {"#6b6f7a","#967441","#67502c","#967441","#967441","#967441","#7e6237","#b58d50","#67502c","#967441","#967441","#967441","#7e6237","#b58d50","#967441","#513d24"},
        {"#a6824d","#967441","#67502c","#967441","#967441","#7e6237","#7e6237","#b58d50","#67502c","#967441","#967441","#7e6237","#7e6237","#b58d50","#967441","#7e6237"},
        {"#a6824d","#967441","#7e6237","#a6824d","#b58d50","#b58d50","#b58d50","#a6824d","#7e6237","#a6824d","#b58d50","#b58d50","#b58d50","#a6824d","#7e6237","#67502c"},
        {"#b8945f","#7e6237","#7e6237","#967441","#a6824d","#a6824d","#967441","#7e6237","#7e6237","#967441","#a6824d","#a6824d","#967441","#7e6237","#7e6237","#67502c"},
        {"#67502c","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24","#513d24"}
    };

    static final String furnace[][] = {
        {"#504e4e","#504e4e","#504e4e","#504e4e","#3c3b3b","#504e4e","#504e4e","#504e4e","#3c3b3b","#3c3b3b","#3c3b3b","#504e4e","#3c3b3b","#3c3b3b","#504e4e","#504e4e"},
        {"#504e4e","#686868","#686868","#777777","#777777","#686868","#777777","#686868","#777777","#777777","#686868","#777777","#686868","#777777","#5d5b5b","#504e4e"},
        {"#3c3b3b","#5d5b5b","#777777","#919191","#777777","#858585","#686868","#777777","#858585","#919191","#858585","#919191","#777777","#686868","#777777","#504e4e"},
        {"#504e4e","#686868","#858585","#858585","#3c3b3b","#212121","#212121","#212121","#212121","#212121","#212121","#3c3b3b","#858585","#777777","#686868","#504e4e"},
        {"#504e4e","#777777","#858585","#3c3b3b","#111111","#111111","#111111","#111111","#111111","#111111","#111111","#111111","#3c3b3b","#777777","#5d5b5b","#3c3b3b"},
        {"#3c3b3b","#777777","#686868","#111111","#111111","#111111","#212121","#212121","#212121","#212121","#111111","#111111","#111111","#919191","#5d5b5b","#3c3b3b"},
        {"#504e4e","#777777","#686868","#111111","#111111","#3c3b3b","#3c3b3b","#3c3b3b","#3c3b3b","#3c3b3b","#3c3b3b","#111111","#111111","#919191","#5d5b5b","#504e4e"},
        {"#3c3b3b","#777777","#919191","#a8a8a8","#a8a8a8","#b0b0b0","#b0b0b0","#b0b0b0","#b0b0b0","#b0b0b0","#b0b0b0","#a8a8a8","#a8a8a8","#919191","#777777","#3c3b3b"},
        {"#3c3b3b","#777777","#858585","#777777","#686868","#5d5b5b","#777777","#686868","#5d5b5b","#686868","#777777","#686868","#777777","#686868","#686868","#504e4e"},
        {"#504e4e","#c5c5c5","#b0b0b0","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#c5c5c5","#a8a8a8","#504e4e"},
        {"#504e4e","#a8a8a8","#a8a8a8","#a8a8a8","#b0b0b0","#a8a8a8","#858585","#858585","#858585","#858585","#a8a8a8","#b0b0b0","#a8a8a8","#b0b0b0","#9d9d9d","#3c3b3b"},
        {"#504e4e","#9d9d9d","#a8a8a8","#919191","#5d5b5b","#212121","#111111","#111111","#111111","#111111","#212121","#ff8f00","#919191","#a8a8a8","#9d9d9d","#504e4e"},
        {"#504e4e","#919191","#919191","#504e4e","#ff8f00","#111111","#c35d1b","#ff8f00","#ff8f00","#c35d1b","#ffd800","#ffd800","#504e4e","#777777","#9d9d9d","#504e4e"},
        {"#504e4e","#777777","#919191","#111111","#ffd800","#ffd800","#ff8f00","#ffff97","#ffd800","#ffd800","#ffff97","#ff8f00","#111111","#9d9d9d","#919191","#504e4e"},
        {"#3c3b3b","#919191","#777777","#c35d1b","#ffd800","#ffff97","#ffd800","#ffffff","#ffd800","#ffffff","#ffff97","#ffd800","#c35d1b","#777777","#9d9d9d","#3c3b3b"},
        {"#3c3b3b","#686868","#3c3b3b","#ff8f00","#ff8f00","#ffffff","#ffff97","#ffffff","#ff8f00","#ffff97","#ffd800","#ff8f00","#ffd800","#3c3b3b","#686868","#3c3b3b"}
    };

    static final String chest[][] = {
        {"#463e32","#413b2f","#413b2f","#413b2f","#413b2f","#463e32","#463e32","#453d31","#413b2f","#463e32","#463e32","#463e32","#463e32","#463e32","#463e32","#332e25"},
        {"#463e32","#ab792d","#a47227","#a76e1f","#a47227","#a47227","#8f691d","#8f691d","#8f691d","#8f691d","#8f691d","#a47227","#8f691d","#a47227","#ab792d","#28241d"},
        {"#463e32","#ab792d","#8f691d","#8f691d","#8f691d","#8f691d","#a47227","#855c1f","#8b6224","#ab792d","#ab792d","#a47227","#a76e1f","#ab792d","#ab792d","#28241d"},
        {"#443c30","#a26b23","#a26b23","#a76e1f","#a76e1f","#a76e1f","#885919","#cdcdcd","#a5a5a5","#885919","#a26b23","#a26b23","#a26b23","#a26b23","#a76e1f","#2a251d"},
        {"#463e32","#7f5f22","#7f5f22","#7f5f22","#7f5f22","#956c2e","#795825","#c2c2c2","#868686","#543e16","#7f5f22","#926323","#90662a","#90662a","#90662a","#2b261f"},
        {"#413b2f","#332e25","#362f25","#363026","#363026","#363026","#2c271f","#a5a5a5","#767676","#2c271e","#363026","#363026","#332e25","#332e25","#332e25","#1f1c17"},
        {"#463e32","#775a30","#775a30","#73562e","#775a30","#775a30","#614927","#919191","#767676","#45351a","#755429","#775a30","#775a30","#775a30","#775a30","#2b261f"},
        {"#453c2f","#926323","#8e6126","#8e6126","#8e6126","#8e6126","#734f1e","#614116","#614116","#77501c","#8e6126","#8e6126","#8e6126","#8e6126","#825b26","#2a251d"},
        {"#463e32","#ab792d","#ab792d","#ab792d","#ab792d","#a76e1f","#8f691d","#ab792d","#ab792d","#a47227","#a47227","#a47227","#ab792d","#ab792d","#956c2e","#28241d"},
        {"#413b2f","#8f691d","#8f691d","#8f691d","#8f691d","#ab792d","#a47227","#a47227","#8f691d","#8f691d","#8f691d","#a76e1f","#ab792d","#8f691d","#7f5f22","#28241d"},
        {"#463e32","#a47227","#a47227","#a47227","#ab792d","#ab792d","#8f691d","#8f691d","#8f691d","#8f691d","#a47227","#a47227","#a47227","#a47227","#90662a","#28241d"},
        {"#453c2f","#a26b23","#a76e1f","#a76e1f","#a26b23","#a26b23","#a26b23","#a76e1f","#a76e1f","#a76e1f","#a76e1f","#a76e1f","#a26b23","#a26b23","#8e6126","#2a251d"},
        {"#463e32","#ab792d","#ab792d","#ab792d","#ab792d","#8f691d","#ab792d","#8f691d","#8f691d","#8f691d","#8f691d","#8f691d","#a47227","#a76e1f","#956c2e","#2b261f"},
        {"#453d31","#8f691d","#a76e1f","#ab792d","#ab792d","#ab792d","#ab792d","#8f691d","#ab792d","#a47227","#a47227","#8f691d","#8f691d","#8f691d","#7f5f22","#2a261e"},
        {"#463e32","#956c2e","#7f5f22","#7f5f22","#7f5f22","#956c2e","#956c2e","#7f5f22","#956c2e","#956c2e","#7f5f22","#90662a","#956c2e","#956c2e","#84622f","#2b261f"},
        {"#2a251d","#2a251d","#2a251d","#2c251d","#2a251e","#2a251e","#2c251d","#2a251e","#2a251d","#2a251d","#2a251d","#2a251e","#27231e","#2a251e","#2a251e","#211d17"}
    };

    static final String craftingTable[][] = {
        {"#19140c","#af8f55","#b8945f","#c29d62","#c29d62","#382116","#733920","#4b2b18","#4b2b18","#733920","#382116","#c29d62","#c29d62","#c29d62","#b8945f","#19140c"},
        {"#19140c","#b8945f","#af8f55","#af8f55","#967441","#9f844d","#382116","#4b2b18","#4b2b18","#382116","#af8f55","#af8f55","#b8945f","#b8945f","#9f844d","#19140c"},
        {"#19140c","#b8945f","#b8945f","#b8945f","#af8f55","#b8945f","#af8f55","#382116","#382116","#9f844d","#9f844d","#af8f55","#af8f55","#b8945f","#b8945f","#19140c"},
        {"#19140c","#7e6237","#7e6237","#967441","#967441","#7e6237","#67502c","#1b160d","#1b160d","#7e6237","#67502c","#41230e","#41230e","#41230e","#7e6237","#19140c"},
        {"#19140c","#c29d62","#9f844d","#c29d62","#c29d62","#c29d62","#c29d62","#4b2b18","#4b2b18","#c29d62","#c29d62","#281e0b","#af8f55","#281e0b","#9f844d","#19140c"},
        {"#19140c","#b8945f","#b8945f","#41230e","#9f844d","#af8f55","#9f844d","#382116","#382116","#af8f55","#af8f55","#281e0b","#281e0b","#281e0b","#b8945f","#19140c"},
        {"#19140c","#9f844d","#af8f55","#281e0b","#af8f55","#af8f55","#af8f55","#382116","#382116","#b8945f","#b8945f","#b5b5b5","#b5b5b5","#b5b5b5","#9f844d","#19140c"},
        {"#19140c","#67502c","#7e6237","#281e0b","#967441","#7e6237","#67502c","#1b160d","#1b160d","#67502c","#7e6237","#ffffff","#d8d8d8","#d8d8d8","#7e6237","#19140c"},
        {"#19140c","#c29d62","#c29d62","#281e0b","#af8f55","#af8f55","#c29d62","#4b2b18","#4b2b18","#c29d62","#c29d62","#ffffff","#d8d8d8","#d8d8d8","#b8945f","#19140c"},
        {"#19140c","#af8f55","#d8d8d8","#d8d8d8","#d8d8d8","#b8945f","#af8f55","#382116","#382116","#9f844d","#af8f55","#9f844d","#d8d8d8","#d8d8d8","#9f844d","#19140c"},
        {"#19140c","#b8945f","#b5b5b5","#d8d8d8","#ffffff","#9f844d","#9f844d","#382116","#382116","#af8f55","#af8f55","#af8f55","#ffffff","#d8d8d8","#b8945f","#19140c"},
        {"#19140c","#67502c","#7e6237","#967441","#967441","#7e6237","#67502c","#110e08","#110e08","#7e6237","#967441","#7e6237","#7e6237","#d8d8d8","#67502c","#19140c"},
        {"#19140c","#9f844d","#b8945f","#c29d62","#c29d62","#b8945f","#b8945f","#4b2b18","#4b2b18","#c29d62","#c29d62","#9f844d","#c29d62","#ffffff","#c29d62","#19140c"},
        {"#19140c","#af8f55","#b8945f","#b8945f","#9f844d","#9f844d","#af8f55","#382116","#382116","#b8945f","#b8945f","#af8f55","#b8945f","#af8f55","#af8f55","#19140c"},
        {"#19140c","#9f844d","#9f844d","#af8f55","#b8945f","#af8f55","#9f844d","#382116","#382116","#b8945f","#af8f55","#9f844d","#9f844d","#9f844d","#9f844d","#19140c"},
        {"#1b160d","#7e6237","#7e6237","#67502c","#67502c","#7e6237","#967441","#19140c","#1b160d","#7e6237","#67502c","#7e6237","#67502c","#67502c","#67502c","#1b160d"}
    };

    static final String stoneBlock[][] = {
        {"#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#747474","#7f7f7f","#747474","#686868","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#747474","#7f7f7f","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#686868","#686868","#747474","#7f7f7f","#747474"},
        {"#7f7f7f","#747474","#686868","#686868","#747474","#747474","#747474","#686868","#747474","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#8f8f8f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#747474","#747474","#747474"},
        {"#747474","#7f7f7f","#7f7f7f","#747474","#747474","#747474","#7f7f7f","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#747474","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#747474","#747474","#686868","#747474","#686868","#747474","#8f8f8f"},
        {"#747474","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#747474","#8f8f8f","#8f8f8f","#747474","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#747474","#747474","#686868","#686868","#747474","#686868","#747474","#747474","#7f7f7f","#7f7f7f","#747474","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#8f8f8f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#747474"},
        {"#7f7f7f","#7f7f7f","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f"},
        {"#686868","#7f7f7f","#747474","#7f7f7f","#747474","#747474","#686868","#686868","#747474","#7f7f7f","#747474","#7f7f7f","#7f7f7f","#747474","#747474","#747474"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#8f8f8f"},
        {"#7f7f7f","#747474","#747474","#747474","#7f7f7f","#8f8f8f","#7f7f7f","#747474","#747474","#7f7f7f","#7f7f7f","#686868","#686868","#747474","#686868","#747474"},
        {"#8f8f8f","#8f8f8f","#7f7f7f","#747474","#747474","#7f7f7f","#7f7f7f","#747474","#747474","#747474","#7f7f7f","#7f7f7f","#747474","#747474","#747474","#8f8f8f"},
        {"#7f7f7f","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#747474","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#747474","#7f7f7f","#7f7f7f"}
    };

    static final String coalOreBlock[][] = {
        {"#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#747474","#7f7f7f","#747474","#686868","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#747474","#7f7f7f","#747474","#7f7f7f","#5c5c5c","#5c5c5c","#5c5c5c","#7f7f7f","#7f7f7f","#686868","#686868","#5c5c5c","#7f7f7f","#747474"},
        {"#7f7f7f","#747474","#686868","#686868","#747474","#5c5c5c","#252525","#393c36","#363636","#5c5c5c","#747474","#7f7f7f","#2e2e2e","#363636","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#5c5c5c","#747474","#747474","#7f7f7f","#2e2e2e","#393c36","#363636","#494b3f","#2e2e2e","#252525","#7f7f7f","#7f7f7f","#747474","#747474","#747474"},
        {"#747474","#252525","#363636","#747474","#747474","#747474","#5c5c5c","#2e2e2e","#252525","#252525","#5c5c5c","#747474","#747474","#747474","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#747474","#747474","#5c5c5c","#5c5c5c","#686868","#747474","#8f8f8f"},
        {"#747474","#8f8f8f","#7f7f7f","#747474","#5c5c5c","#747474","#747474","#747474","#7f7f7f","#747474","#393c36","#2e2e2e","#393c36","#5c5c5c","#7f7f7f","#7f7f7f"},
        {"#747474","#5c5c5c","#747474","#5c5c5c","#252525","#393c36","#2e2e2e","#5c5c5c","#7f7f7f","#7f7f7f","#5c5c5c","#393c36","#494b3f","#7f7f7f","#8f8f8f","#8f8f8f"},
        {"#8f8f8f","#747474","#7f7f7f","#252525","#393c36","#494b3f","#363636","#2e2e2e","#7f7f7f","#747474","#7f7f7f","#747474","#747474","#747474","#7f7f7f","#747474"},
        {"#7f7f7f","#8f8f8f","#747474","#5c5c5c","#2e2e2e","#363636","#5c5c5c","#747474","#747474","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#5c5c5c","#5c5c5c","#7f7f7f"},
        {"#686868","#7f7f7f","#8f8f8f","#747474","#5c5c5c","#5c5c5c","#7f7f7f","#747474","#7f7f7f","#747474","#747474","#747474","#5c5c5c","#252525","#393c36","#686868"},
        {"#7f7f7f","#7f7f7f","#5c5c5c","#5c5c5c","#747474","#5c5c5c","#7f7f7f","#7f7f7f","#747474","#7f7f7f","#5c5c5c","#5c5c5c","#747474","#747474","#747474","#747474"},
        {"#7f7f7f","#5c5c5c","#252525","#494b3f","#363636","#252525","#252525","#8f8f8f","#8f8f8f","#5c5c5c","#494b3f","#393c36","#252525","#747474","#686868","#686868"},
        {"#8f8f8f","#747474","#5c5c5c","#393c36","#252525","#5c5c5c","#747474","#747474","#747474","#5c5c5c","#363636","#252525","#5c5c5c","#747474","#747474","#7f7f7f"},
        {"#7f7f7f","#747474","#747474","#747474","#7f7f7f","#7f7f7f","#363636","#2e2e2e","#7f7f7f","#7f7f7f","#5c5c5c","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f"},
        {"#7f7f7f","#7f7f7f","#747474","#747474","#747474","#7f7f7f","#8f8f8f","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#747474","#7f7f7f","#7f7f7f"}
    };

    static final String ironOreBlock[][] = {
        {"#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#747474","#747474","#7f7f7f","#747474","#686868","#747474","#747474","#747474","#747474","#8f8f8f","#8f8f8f"},
        {"#7f7f7f","#7f7f7f","#747474","#686868","#686868","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#77674f","#887455","#887455","#77674f","#7f7f7f","#747474"},
        {"#7f7f7f","#747474","#887455","#af8e77","#887455","#747474","#7f7f7f","#686868","#747474","#747474","#7f7f7f","#887455","#af8e77","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#887455","#af8e77","#d8af93","#8f8f8f","#7f7f7f","#747474","#686868","#686868","#686868","#747474","#7f7f7f","#7f7f7f","#747474","#747474","#747474"},
        {"#747474","#8f8f8f","#8f8f8f","#8f8f8f","#747474","#686868","#686868","#887455","#887455","#af8e77","#af8e77","#887455","#686868","#686868","#747474","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#7f7f7f","#7f7f7f","#887455","#af8e77","#d8af93","#d8af93","#e2c0aa","#d8af93","#af8e77","#7f7f7f","#747474","#887455","#af8e77","#8f8f8f"},
        {"#747474","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#af8e77","#d8af93","#d8af93","#8f8f8f","#7f7f7f","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f"},
        {"#747474","#747474","#7f7f7f","#686868","#686868","#747474","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#686868","#686868","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#8f8f8f","#8f8f8f","#686868","#887455","#af8e77","#686868","#686868","#747474","#7f7f7f","#77674f","#887455","#af8e77","#77674f","#747474","#7f7f7f","#747474"},
        {"#7f7f7f","#8f8f8f","#77674f","#af8e77","#af8e77","#d8af93","#d8af93","#8f8f8f","#7f7f7f","#8f8f8f","#af8e77","#d8af93","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f"},
        {"#686868","#7f7f7f","#8f8f8f","#8f8f8f","#d8af93","#e2c0aa","#8f8f8f","#686868","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#747474","#747474"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#77674f","#887455","#8f8f8f","#7f7f7f","#8f8f8f"},
        {"#7f7f7f","#747474","#686868","#747474","#887455","#af8e77","#8f8f8f","#747474","#77674f","#887455","#af8e77","#d8af93","#d8af93","#af8e77","#887455","#747474"},
        {"#8f8f8f","#887455","#af8e77","#747474","#7f7f7f","#8f8f8f","#7f7f7f","#747474","#8f8f8f","#af8e77","#d8af93","#e2c0aa","#af8e77","#8f8f8f","#8f8f8f","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#887455","#77674f","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#747474","#747474","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#7f7f7f","#7f7f7f"}
    };

    static final String goldOreBlock[][] = {
        {"#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#747474","#747474","#747474","#7f7f7f","#747474","#686868","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#747474","#7f7f7f","#9c7020","#7f7f7f","#7f7f7f","#686868","#7f7f7f","#7f7f7f","#7f7f7f","#686868","#686868","#5c5c5c","#7f7f7f","#747474"},
        {"#7f7f7f","#747474","#686868","#686868","#8f8f8f","#686868","#5c5c5c","#9c7020","#686868","#747474","#747474","#5c5c5c","#5c5c5c","#9c7020","#9c7020","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#686868","#5c5c5c","#9c7020","#eb9d0e","#9c7020","#747474","#7f7f7f","#5c5c5c","#9c7020","#eb9d0e","#9c7020","#747474"},
        {"#747474","#7f7f7f","#7f7f7f","#686868","#5c5c5c","#9c7020","#eb9d0e","#fcee4b","#9c7020","#686868","#8f8f8f","#8f8f8f","#eb9d0e","#eb9d0e","#a2a2a2","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#7f7f7f","#686868","#eb9d0e","#fcee4b","#fcee4b","#ffffb5","#eb9d0e","#747474","#747474","#686868","#a2a2a2","#a2a2a2","#747474","#8f8f8f"},
        {"#747474","#7f7f7f","#7f7f7f","#8f8f8f","#a2a2a2","#eb9d0e","#fcee4b","#eb9d0e","#9c7020","#a2a2a2","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#747474","#747474","#686868","#686868","#747474","#a2a2a2","#eb9d0e","#a2a2a2","#a2a2a2","#7f7f7f","#747474","#747474","#747474","#eb9d0e","#9c7020","#7f7f7f"},
        {"#8f8f8f","#686868","#9c7020","#eb9d0e","#8f8f8f","#a2a2a2","#9c7020","#a2a2a2","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#686868","#7f7f7f","#7f7f7f","#747474"},
        {"#7f7f7f","#747474","#eb9d0e","#fcee4b","#a2a2a2","#7f7f7f","#a2a2a2","#8f8f8f","#8f8f8f","#7f7f7f","#5c5c5c","#5c5c5c","#5c5c5c","#686868","#8f8f8f","#7f7f7f"},
        {"#686868","#8f8f8f","#a2a2a2","#a2a2a2","#8f8f8f","#747474","#686868","#686868","#747474","#5c5c5c","#9c7020","#9c7020","#eb9d0e","#686868","#686868","#747474"},
        {"#7f7f7f","#7f7f7f","#686868","#686868","#686868","#8f8f8f","#8f8f8f","#7f7f7f","#686868","#9c7020","#eb9d0e","#eb9d0e","#ffffb5","#fcee4b","#9c7020","#686868"},
        {"#7f7f7f","#747474","#9c7020","#9c7020","#eb9d0e","#747474","#7f7f7f","#9c7020","#747474","#a2a2a2","#eb9d0e","#fcee4b","#fcee4b","#a2a2a2","#a2a2a2","#747474"},
        {"#8f8f8f","#9c7020","#eb9d0e","#fcee4b","#ffffb5","#fcee4b","#8f8f8f","#a2a2a2","#747474","#7f7f7f","#9c7020","#eb9d0e","#a2a2a2","#747474","#747474","#8f8f8f"},
        {"#7f7f7f","#747474","#a2a2a2","#eb9d0e","#fcee4b","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#a2a2a2","#a2a2a2","#8f8f8f","#8f8f8f","#eb9d0e","#8f8f8f"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#a2a2a2","#7f7f7f","#747474","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#747474","#7f7f7f","#7f7f7f"}
    };

    static final String diamondOreBlock[][] = {
        {"#8f8f8f","#7f7f7f","#7f7f7f","#8f8f8f","#7f7f7f","#747474","#747474","#7f7f7f","#747474","#676767","#747474","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f"},
        {"#7f7f7f","#7f7f7f","#747474","#7f7f7f","#676767","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#747474","#676767","#676767","#747474","#7f7f7f"},
        {"#7f7f7f","#747474","#676767","#676767","#1ed0d6","#8f8f8f","#7f7f7f","#676767","#676767","#747474","#747474","#676767","#77e7d1","#239698","#7f7f7f","#7f7f7f"},
        {"#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#8dadb1","#8f8f8f","#676767","#77e7d1","#239698","#8dadb1","#8f8f8f","#7f7f7f","#8dadb1","#8f8f8f","#747474","#747474"},
        {"#747474","#7f7f7f","#7f7f7f","#7f7f7f","#747474","#676767","#676767","#8f8f8f","#8dadb1","#7f7f7f","#747474","#7f7f7f","#8f8f8f","#747474","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#7f7f7f","#747474","#676767","#d5fff6","#77e7d1","#676767","#7f7f7f","#747474","#d5fff6","#77e7d1","#747474","#676767","#747474","#8f8f8f"},
        {"#747474","#747474","#8f8f8f","#d5fff6","#77e7d1","#1ed0d6","#1ed0d6","#239698","#8dadb1","#7f7f7f","#1ed0d6","#239698","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#8f8f8f","#676767","#676767","#8f8f8f","#8dadb1","#a2a2a2","#8dadb1","#8dadb1","#676767","#676767","#8f8f8f","#8dadb1","#7f7f7f","#8f8f8f","#a2a2a2","#a2a2a2"},
        {"#676767","#77e7d1","#1ed0d6","#8dadb1","#8f8f8f","#7f7f7f","#747474","#676767","#d5fff6","#77e7d1","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#747474"},
        {"#7f7f7f","#8dadb1","#8dadb1","#7f7f7f","#676767","#7f7f7f","#747474","#77e7d1","#1ed0d6","#239698","#239698","#8dadb1","#8f8f8f","#a2a2a2","#a2a2a2","#7f7f7f"},
        {"#676767","#7f7f7f","#747474","#7f7f7f","#1ed0d6","#747474","#676767","#8f8f8f","#8dadb1","#8dadb1","#8f8f8f","#676767","#676767","#747474","#747474","#747474"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#747474","#676767","#77e7d1","#239698","#8f8f8f","#8f8f8f","#7f7f7f"},
        {"#7f7f7f","#747474","#8f8f8f","#676767","#676767","#7f7f7f","#8f8f8f","#747474","#77e7d1","#d5fff6","#77e7d1","#1ed0d6","#1ed0d6","#239698","#8f8f8f","#747474"},
        {"#8f8f8f","#8f8f8f","#8dadb1","#77e7d1","#239698","#676767","#747474","#7f7f7f","#a2a2a2","#239698","#1ed0d6","#8dadb1","#8dadb1","#8f8f8f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#747474","#747474","#8dadb1","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#7f7f7f","#8f8f8f","#8dadb1","#7f7f7f","#747474","#747474","#747474","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#747474","#8f8f8f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f"}
    };

    static final String emeraldOreBlock[][] = {
        {"#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#747474","#7f7f7f","#747474","#686868","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#526b53","#516c53","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#516c53","#526b51","#686868","#747474","#7f7f7f","#747474"},
        {"#7f7f7f","#526b51","#d9ffe7","#17dd61","#747474","#747474","#7c817d","#7f7f7f","#747474","#526b4e","#dbfee9","#17dd61","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#7f7f7f","#17dd61","#007b18","#7f7f7f","#7f7f7f","#546a51","#7f7f7f","#8f8f8f","#8f8f8f","#17dd61","#007b18","#8f8f8f","#747474","#747474","#747474"},
        {"#747474","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#546a51","#375b41","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#8f8f8f","#747474","#7f7f7f","#7f7f7f"},
        {"#7f7f7f","#8f8f8f","#7f7f7f","#8f8f8f","#8f8f8f","#43f285","#41f383","#1d982a","#526b53","#737672","#747474","#686868","#747474","#686868","#747474","#8f8f8f"},
        {"#747474","#7c817d","#646968","#375b3f","#41f385","#dbfee9","#017a18","#1a992a","#375b3f","#7f807b","#747474","#7f7f7f","#7f7f7d","#526b53","#546955","#7f7f7f"},
        {"#747474","#526a55","#526b51","#375b3f","#41f385","#007b18","#1b982a","#17c544","#375b3f","#526b51","#747474","#747474","#526b51","#d9feeb","#17dd63","#7f7f7f"},
        {"#526b51","#dbfeeb","#17dd61","#7f7f7f","#17c546","#1d9828","#8f8f8f","#8f8f8f","#747474","#747474","#7f7f7f","#7f7f7f","#7f7f7f","#17dd61","#007b18","#747474"},
        {"#817e7d","#17dd5f","#017a18","#8f8f8f","#8f8f8f","#8c918f","#7f7f7f","#7f7f7f","#8e908f","#7f7f81","#516c53","#526b51","#69666a","#8e908d","#8e908d","#7f7f7f"},
        {"#686868","#8f8f8f","#747474","#7f7f7f","#7f7f7f","#8f8f8f","#7f7f7f","#686868","#817e7d","#40f385","#41f385","#375b3f","#666868","#747474","#747474","#747474"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#7f7f7f","#007b18","#40f385","#d7ffeb","#007b18","#1b982a","#7d807d","#7f7f7f","#8f8f8f"},
        {"#7f7f7f","#747474","#747474","#747474","#526b51","#526b51","#7f7f7f","#747474","#007b18","#16c644","#007b16","#1b982a","#17c544","#747474","#686868","#747474"},
        {"#8f8f8f","#8f8f8f","#817e7d","#526b51","#d7ffeb","#16de61","#7f7f7f","#747474","#767472","#375b3f","#1b982a","#918e8f","#8f8f91","#747572","#747474","#8f8f8f"},
        {"#7f7f7f","#747474","#747474","#7f7f7f","#16de63","#007b18","#8f8f8f","#7f7f7f","#686868","#8f8f91","#8f8f8f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f"},
        {"#7f7f7f","#7f7f7f","#7f7f7f","#7f7f7f","#8f8f8f","#8f8f8f","#747474","#747474","#7f7f7f","#8f8f8f","#8f8f8f","#8f8f8f","#7f7f7f","#747474","#7f7f7f","#7f7f7f"}
    };

    static final String TNT[][] = {
        {"#ea4318","#ea4318","#db2f1a","#b11527","#ea4318","#ea4318","#db2f1a","#b11527","#ea4318","#ea4318","#db2f1a","#b11527","#ea4318","#ea4318","#db2f1a","#b11527"},
        {"#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11"},
        {"#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11"},
        {"#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11"},
        {"#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11"},
        {"#ffffff","#cecece","#ddd9d9","#ddd9d9","#cecece","#cecece","#ddd9d9","#ddd9d9","#ddd9d9","#cecece","#cecece","#ddd9d9","#ddd9d9","#ddd9d9","#ddd9d9","#ffffff"},
        {"#ffffff","#ddd9d9","#373656","#373656","#1b1a3c","#ddd9d9","#373656","#cecece","#cecece","#1b1a3c","#ddd9d9","#373656","#373656","#1b1a3c","#cecece","#ffffff"},
        {"#ddd9d9","#beb2b3","#cecece","#1b1a3c","#cecece","#cecece","#373656","#373656","#cecece","#373656","#cecece","#ddd9d9","#373656","#ddd9d9","#ddd9d9","#ddd9d9"},
        {"#ffffff","#cecece","#ddd9d9","#373656","#ddd9d9","#ddd9d9","#373656","#ddd9d9","#373656","#373656","#cecece","#cecece","#1b1a3c","#cecece","#beb2b3","#ddd9d9"},
        {"#ffffff","#ddd9d9","#cecece","#1b1a3c","#cecece","#ddd9d9","#373656","#cecece","#cecece","#1b1a3c","#cecece","#cecece","#1b1a3c","#ddd9d9","#cecece","#ffffff"},
        {"#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3","#beb2b3"},
        {"#b11527","#b11527","#912d11","#912d11","#b11527","#b11527","#912d11","#912d11","#b11527","#b11527","#912d11","#912d11","#b11527","#b11527","#912d11","#912d11"},
        {"#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11"},
        {"#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11"},
        {"#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11","#db2f1a","#db2f1a","#b11527","#912d11"},
        {"#b11527","#b11527","#b11527","#912d11","#b11527","#b11527","#b11527","#912d11","#b11527","#b11527","#b11527","#912d11","#b11527","#b11527","#b11527","#912d11"}
    };
}
