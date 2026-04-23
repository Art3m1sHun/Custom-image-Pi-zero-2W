SUMMARY = "MINH HUNG CUSTOM IMAGE"
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_LINGUAS = " "
LICENSE = "MIT"
inherit core-image
inherit extrausers
#Set rootfs to 200MiB by default
IMAGE_OVERHEAD_FACTOR ?= "1.0"
IMAGE_ROOTFS_SIZE ?= "204800"
IMAGE_ROOTFS_MAXSIZE = "2097152"


IMAGE_INSTALL:append = " custom-banner openssh wpa-supplicant iw"
IMAGE_FEATURES += "serial-autologin-root"
IMAGE_INSTALL += "kernel-modules"

