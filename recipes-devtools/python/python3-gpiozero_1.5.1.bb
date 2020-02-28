DESCRIPTION = "A simple interface to GPIO devices with Raspberry Pi"
HOMEPAGE = "https://gpiozero.readthedocs.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE.rst;md5=96cd08cadd8a35cf94fc1770ee0743da"

PYPI_PACKAGE = "gpiozero"
inherit pypi distutils3

SRC_URI[md5sum] = "3783098afbc8e0997a70e5595a365adf"
SRC_URI[sha256sum] = "ae1a8dc4e6e793ffd8f900968f3290d218052c46347fa0c0503c65fabe422e4d"

COMPATIBLE_MACHINE = "^rpi$"
