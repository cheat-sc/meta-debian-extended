require ${COREBASE}/meta/recipes-graphics/xorg-lib/xcb-util.inc

# clear SRC_URI
SRC_URI = ""
inherit debian-package
require recipes-debian/sources/xcb-util.inc
DEBIAN_QUILT_PATCHES = ""

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/xcb_aux.c;endline=30;md5=ae305b9c2a38f9ba27060191046a6460 \
                    file://src/xcb_event.h;endline=27;md5=627be355aee59e1b8ade80d5bd90fad9"
