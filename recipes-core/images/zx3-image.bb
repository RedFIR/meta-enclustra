SUMMARY = "Developement Image for ZX3 Modules"
DESCRIPTION = "Image with some basic developement and diagnostic tools"
AUTHOR = "David Andrey <david.andrey@netmodule.com>"
HOMEPAGE = "http://www.netmodule.com"

LICENSE = "MIT"
inherit core-image

# Start with minimal linux image
include recipes-graphics/images/core-image-minimal.bb

IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL_append += " \
                bash \
                openssh-sftp-server \
                mtd-utils \
                ethtool \
                usbutils \
                gdbserver \
                iputils \
                devmem2 \
                nfs-utils \
                tcpdump \
                nano \
                netperf \
                i2c-tools \
                "

IMAGE_LINGUAS = " "

export IMAGE_BASENAME = "zx3-image"
